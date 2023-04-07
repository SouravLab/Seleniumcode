package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sourav\\Desktop\\chromedriver.exe");
		// Automation steps:
		// top casting
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");// Enter url
		String title = driver.getTitle();
		System.out.println("title is: " + title);// get the title

		// verification point/checkpoint/ act vs exp result

		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("Incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		if (driver.getPageSource().contains("Copyright The Closure Library Authors.")) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}
		
		
		// Automation steps:
		driver.quit();
	}

}
