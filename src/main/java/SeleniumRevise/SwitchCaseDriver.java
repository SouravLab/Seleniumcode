package SeleniumRevise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchCaseDriver {

	private WebDriver driver;

	public WebDriver init_Driver(String browser) {

		switch (browser.trim().toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		default:
			break;
		}
       return driver;
	}

	public static void main(String[] args) {
		SwitchCaseDriver obj=new SwitchCaseDriver();
		obj.init_Driver("firefox");
	}

}
