package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("virat");
		Thread.sleep(3000);
		
		List<WebElement> suggList=   driver.findElements(By.xpath("//ul[@class='G43f7e'] //div[@class='wM6W7d']/span"));
		Thread.sleep(3000);
      System.out.println(suggList.size());
      
      for(WebElement e:suggList) {
    	  String text=e.getText();
    	  System.out.println(text);
    	  if (text.contains("kohli score today")){
    		  e.click();
    		  break;
		}
    	  
      }

		
		
		
	}
}
