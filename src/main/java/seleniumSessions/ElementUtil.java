package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;

	ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "cssSelector":
			locator = By.cssSelector(locatorValue);
			break;
		case "tagName":
			locator = By.tagName(locatorValue);
			break;
		case "linkText":
			locator = By.linkText(locatorValue);
			break;
		case "partialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;
		default:
			break;
		}
		return locator;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public String doGetAttribute(By Locator, String attrName) {
		return getElement(Locator).getAttribute(attrName);
	}

	public boolean doIsDisplayed(By loactor) {
		return getElement(loactor).isDisplayed();
	}

	public void doClick(By loacator) {
		getElement(loacator).click();
	}

	public void doClick(String locator, String locatorValue) {
		getElement(getBy(locator, locatorValue)).click();
	}

	public void doSendkeys(String locator, String locatorValue, String value) {
		getElement(getBy(locator, locatorValue)).sendKeys(value);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public int getElementCount(By locator) {
		return getElements(locator).size();
	}

	public void printElementsTextList(By locator) {
		List<WebElement> elelist = getElements(locator);
		for (WebElement e : elelist) {
			String text = e.getText();
			if (!text.isEmpty()) {

				System.out.println(text);
			}
		}
	}

	/*
	 * ********************************dropdown utils******************
	 */
	public void doSelectDropDownByIndex(By locator, int index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}

	public void doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(visibleText);
	}

	public void doSelectDropDownByValuet(By locator, String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}

	public int getDropDownOptionsCount(By loactor) {
		Select sel = new Select(getElement(loactor));
		return sel.getOptions().size();
	}

	public List<String> getDropDownOptionsList(By loactor) {
		Select sel = new Select(getElement(loactor));
		List<WebElement> optionList = sel.getOptions();
		System.out.println(optionList.size());
		List<String> optionTextList = new ArrayList<String>();

		for (WebElement e : optionList) {
			String text = e.getText();
			optionTextList.add(text);
		}
		return optionTextList;
	}

	public void selectValueFromFropDown(By loator, String value) {
		Select sel = new Select(getElement(loator));
		List<WebElement> optionList = sel.getOptions();
		for (WebElement e : optionList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

	public List<String> getElementsTextList(By locator) {
		List<WebElement> elelist = getElements(locator);

		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : elelist) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

	public List<String> getElementsAttributeList(By locator, String attrName) {
		List<WebElement> elelist = getElements(locator);
		List<String> eleAttrlist = new ArrayList<String>();

		for (WebElement e : elelist) {
			String attrval = e.getDomAttribute(attrName);
			eleAttrlist.add(attrval);
		}
		return eleAttrlist;

	}

	public void clickOnLink(By locator, String linkText) {
		List<WebElement> langList = getElements(locator);

		// System.out.println("toatal images : " +langList.size());
		for (WebElement e : langList) {
			System.out.println(langList.size());
			String text = e.getText();
			System.out.println(text);
			if (text.contains(linkText)) {
				e.click();
				break;
			}
		}

	}

//	*************************Action methods***************************

	public void doActionSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}

	/**
	 * Clicks in the middle of the given element. Equivalent to:
	 * Actions.moveToElement(onElement).click()
	 * 
	 * @param locator
	 */
	public void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

}
