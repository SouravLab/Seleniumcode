package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		ElementUtil ele = new ElementUtil(driver);
		br.enterUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(br.getPageTitle());
		By emailId = By.id("input-email");
		By password = By.id("input-password");

		ele.doSendkeys(emailId, "test@gmail.com");
		ele.doSendkeys(password, "test@123");
		br.closeBrowser();

	}

}
