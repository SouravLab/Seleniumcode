package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	private static WebDriver driver;

	public static void main(String[] args) {

		// 1. id always unique
		// 2. name: may be duplicate

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		// driver.findElement(By.name("email")).sendKeys("sms@gmailcom");
		// 3 class name: can be duplicate
		// it will check 1st search field and entering the value
		// driver.findElement(By.className("form-control")).sendKeys("cndcnbzbcz");

		// 4. xpath: is not attribute

		// address of the element in HTML DOM
		// absolute xpath
		// relative xpath
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("ccccdjk");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("pwd");
//		driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
//		By emailId = By.xpath("//*[@id=\"input-email\"]");
//		By pwd = By.xpath("//*[@id=\"input-password\"]");
//		By loginBtn = By.xpath("//*[@id=\"form-login\"]/button");
		ElementUtil ele = new ElementUtil(driver);
//		ele.doSendkeys(emailId, "sm@gmail.com");
//		ele.doSendkeys(pwd, "test@123");
//		ele.doClick(loginBtn);

		// 5. css Selector-cascaded style sheet
//		By emailId = By.cssSelector("#input-email");
//		By pwd = By.cssSelector("#input-password");
//		By loginBtn = By.cssSelector("#form-login > button");
//
//		ele.doSendkeys(emailId, "sm@gmail.com");
//		ele.doSendkeys(pwd, "test@123");
//		ele.doClick(loginBtn);

		// 6. linkText : only for link <a>
		// driver.findElement(By.linkText("Register")).click();

		// 7. partial linkText
		// driver.findElement(By.partialLinkText("Forgotten")).click();
		// 8. tagname:
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);

		By register = By.linkText("Register");
		By fogot = By.partialLinkText("Forgotten");

		System.out.println(ele.doGetText(register));
		System.out.println(ele.doGetText(fogot));
	}

}
