package RandomTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.goibibo.com/");// https://www.goibibo.com/
		WebElement from = driver.findElement(By.xpath("//div[@class='sc-gWXbKe gnEOYq']"));
		from.click();
		Thread.sleep(1000);
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		
		
		
		
		input.sendKeys("bhu");
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//span[@class='autoCompleteTitle ']"));   //// span[@class='autoCompleteTitle
																		
		
		//// ']////ul[@id='autoSuggest-list']//li
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
			if (li.get(i).getText().contains("Bhavnagar")) {
				li.get(i).click();
			}
				
			
		}

	/*	for (int i = 0; i <= li.size(); i++) {
			String value = li.get(i).getText();
			System.out.println(value);
			if (value.contains("Bhavnagar, India")) {
		
				li.get(i).click();
				//JavascriptExecutor executor = (JavascriptExecutor) driver;
				//executor.executeScript("arguments[0].click();", li.get(i));
				break;
			}
		}

		/*
		 * for(WebElement e:li) { String name=e.getText(); System.out.println(name);
		 * if(e.getText().equalsIgnoreCase("Mumbai, India "));
		 * 
		 * }
		 */
	}

}
