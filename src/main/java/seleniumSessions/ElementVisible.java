package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVisible {
	 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By emailId = By.xpath("//*[@id=\"input-email\"]");
		
		Boolean b=driver.findElement(emailId).isDisplayed();
		System.out.println(b);
		ElementUtil ele = new ElementUtil(driver);
		//ele.doIsDisplayed(emailId);
	if (ele.doIsDisplayed(emailId)) {
		ele.doSendkeys(emailId, "sm@gmail.com");
	}
		driver.findElement(emailId).isEnabled();
		//visible -but disabled-false
	
	}

}
