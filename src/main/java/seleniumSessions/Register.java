package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Register extends BrowserUtil {
	
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		driver.manage().window().maximize();
		br.enterUrl("https://demo.opencart.com/index.php?route=account/login");
		
		By resisterBtn=By.xpath("//*[@id=\"column-right\"]/div/a[2]");
		By firstName=By.id("input-firstname");
		//String fName="input-firstname";
		By lastName=By.name("lastname");
		By email=By.xpath("//*[@id=\"input-email\"]");
		By pwd=By.id("input-password");
		By yesRadiobtn=By.xpath("//*[@id=\"input-newsletter-yes\"]");
	    By agreeCheckBox=	By.name("agree");
		By continueBtn= By.xpath("//*[@id=\"form-register\"]/div/div/button");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doClick(resisterBtn);
		
		
		
		ele.doSendkeys(firstName, "m");
		ele.doSendkeys(lastName, "ln");
		ele.doSendkeys(email, "sm@gmail.com");
		ele.doSendkeys(pwd, "sm@123");
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//js.executeScript("arguments[0].click()", yesRadiobtn);
		ele.doClick(yesRadiobtn);
		ele.doClick(agreeCheckBox);
		
		Thread.sleep(1000);
		ele.doClick(continueBtn);
		
		
		
		
	
	}
}
