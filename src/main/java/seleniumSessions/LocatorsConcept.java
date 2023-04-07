package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// 1.
		// driver.findElement(By.id("input-email")).sendKeys("sm@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2.
		// WebElement emailId = driver.findElement(By.id("input-email"));
		// WebElement password = driver.findElement(By.id("input-password"));
		// emailId.sendKeys("sm@gmail.com");
		// password.sendKeys("test@123");

		// 3. by locator:

		// by locator will not hit the server and when required we can use.
		// By emailId = By.id("input-email");
		// By password = By.id("input-password");

		// WebElement email = driver.findElement(emailId);
		// WebElement pwd =driver.findElement(password);

		// email.sendKeys("sm@gmail.com");
		// pwd.sendKeys("test@123");

		// 4 by locator with generic method
//		By emailId = By.id("input-email"); 
//	    By password = By.id("input-password");
//		getElement(emailId).sendKeys("sm@gmail.conm");
//		getElement(password).sendKeys("test@123");
		// here send keys we have to write again and again

		// 5
		// by locator with getElement and actions generic method
//		By emailId = By.id("input-email"); 
//	    By password = By.id("input-password");
//	    doSendkeys(emailId, "sm@gmail.com");
//	    doSendkeys(password, "test@1234");

		// 6
		// by locator with getElement and actions generic method in util class method

//		By emailId = By.id("input-email"); 
//        By password = By.id("input-password");
//		ElementUtil ele = new ElementUtil(driver);
//		ele.doSendkeys(emailId, "sm@gmail.com");
//		ele.doSendkeys(password, "test@123");
//		
		// 7.
		// String locator with By,getElement and actions generic method in util class
		// method
		String eId = "input-email";
		String pwd = "input-password";
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendkeys("id", eId, "sm@gmail.com");
		ele.doSendkeys("id", pwd, "test@123");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
