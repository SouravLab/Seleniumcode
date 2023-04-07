package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetValueAttribute {
	 static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By emailId = By.xpath("//*[@id=\"input-email\"]");
		By pwd = By.xpath("//*[@id=\"input-password\"]");
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendkeys(emailId, "sm@gmail.com");
		String att=driver.findElement(emailId).getAttribute("value");
		System.out.println(att);
		
		String para=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/p[2]")).getText();
		System.out.println(para);
		///System.out.println(ele.doGetText(emailId));// will not work
		String at=ele.doGetAttribute(emailId, "value");
		System.out.println(at);
	}
	
	
}

