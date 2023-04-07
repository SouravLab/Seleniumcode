package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		// System.out.println("toatal images : " +langList.size());
		By langs = By.xpath("//div[@id='SIvCob']/a");
		clickOnLink(langs, "हिन्दी");

	}

	public static void clickOnLink(By locator, String linkText) {
		List<WebElement> langList = driver.findElements(locator);

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

}
