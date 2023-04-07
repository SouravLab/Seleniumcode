package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	// to downgerade browser verson
	
	//WebDriverManager.firefoxdriver().browserVersion("87.12").setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");// Enter url
	String title = driver.getTitle();
	System.out.println("title is: " + title);// get the title
	
	
	
	}

}
