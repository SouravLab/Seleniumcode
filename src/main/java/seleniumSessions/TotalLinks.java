package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
static WebDriver driver;
	public static void main(String[] args) {
		//WAP
		// 1. Total Links
		// 2. Print the text of each links(ignore the blank/empty)
		// 3. print the href value of each link
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	List<WebElement> linksList=	driver.findElements(By.tagName("a"));
		System.out.println("toatal links : " +linksList.size());
		
		// foreach loop
//		int c=0;
//		
//		for(WebElement e: linksList) {
//			String text=e.getText();
//			if (!text.isEmpty()) {
//				System.out.println(c+":"+text);
//			}
//			String href=e.getAttribute("href");
//			System.out.println(href);
//			c++;
//		}
		
		for(int i =0;i <linksList.size();i++) {
			String text =linksList.get(i).getText();
			if(!text.isEmpty()) {
				System.out.println(i+":"+text);
			}
			
			
		}
		
		
	}

}
