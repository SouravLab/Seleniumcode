package RandomTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class CRPM {
	
	public static void main(String[] args) throws InterruptedException, AWTException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("pradhan.monoj@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Monoj_143");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		driver.navigate().refresh();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//driver.findElement(By.xpath("");
		 String name="Manu Test";
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='"+name+"']//parent::td//preceding-sibling::td")));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
	/*	

		//WebElement ele	=driver.findElement(By.xpath("//*[contains(text(),'Manu Test')]//parent::td//preceding-sibling::td//input[@name='id']"));
		WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Manu Test')]//parent::td//preceding-sibling::td//input[@name='id']")));
		driver.navigate().refresh();
		Thread.sleep(5000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[contains(text(),'Manu Test')]//parent::td//preceding-sibling::td//input[@name='id']")));
*/
	}

}
