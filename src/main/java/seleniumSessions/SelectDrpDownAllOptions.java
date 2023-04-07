package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDrpDownAllOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_getForm_Country");
//		Select sel = new Select(driver.findElement(country));
//		List<WebElement> optionList = sel.getOptions();
//		System.out.println(optionList.size());
//		int i = 0;
//		for (WebElement e : optionList) {
//			System.out.println(i + ":" + e.getText());
//			i++;
//		}
		
		selectValueFromFropDown(country, "India");

//		if (getDropDownOptionsList(country).contains("India")) {
//			System.out.println("india present");
//		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> getDropDownOptionsList(By loactor) {
		Select sel = new Select(driver.findElement(loactor));
		List<WebElement> optionList = sel.getOptions();
		System.out.println(optionList.size());
		List<String> optionTextList = new ArrayList<String>();

		for (WebElement e : optionList) {
			String text = e.getText();
			optionTextList.add(text);
		}
		return optionTextList;
	}

	public static void selectValueFromFropDown(By loator, String value) {
		Select sel = new Select(getElement(loator));
		List<WebElement> optionList = sel.getOptions();
		for(WebElement e:optionList) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
		
		
		

	}
}
