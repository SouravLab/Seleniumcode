package RandomTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageLinks {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		
		ChromeDriver driver=new ChromeDriver();
	
		
		//WebDriver driver1=new FirefoxDriver();
		
		
		
            driver.get("https://www.google.co.in/");   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		By All_links= By.tagName("a");
		
		List<WebElement> ele=driver.findElements(All_links);
		int i=ele.size();
		System.out.println("size="+i);
		for(WebElement e: ele) {
			
			
			
		String s=	e.getText();
		
		if (!s.isEmpty())
		
			System.out.println(s);
		}
		
		
		
		

	}

}
