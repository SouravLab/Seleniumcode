package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	//	chrome on WINDOWS (f80aef0886942bcd4e8fab4102cc6a93)
		String title = driver.getTitle();
		System.out.println("title is: " + title);
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("Incorrect title");
		}
		System.out.println(driver.getCurrentUrl());

		// 1. 
	//	driver.quit();
		//chrome on WINDOWS (f80aef0886942bcd4e8fab4102cc6a93)
		System.out.println(driver.getTitle());
		// org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		// quit will close the server n
		//driver = new ChromeDriver();
		//driver.getTitle();
		// 2. 
		driver.close();
		System.out.println(driver.getTitle());//org.openqa.selenium.NoSuchSessionException: invalid session id
		
	}

}
