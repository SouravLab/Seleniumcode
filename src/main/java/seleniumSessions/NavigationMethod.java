package seleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethod {

	public static void main(String[] args) throws MalformedURLException {
		
		// The both navigate and get methods are synonyms.doing same thing
		
		/*
		 * get method:
		 * 
		 * Open Declaration void org.openqa.selenium.WebDriver.get(String url)
		 * 
		 * 
		 * Load a new web page in the current browser window. This is done using an HTTP
		 * POST operation,and the method will block until the load is complete (with the
		 * default 'page load strategy'.This will follow redirects issued either by the
		 * server or as a meta-redirect from within thereturned HTML. Should a
		 * meta-redirect "rest" for any duration of time, it is best to wait untilthis
		 * timeout is over, since should the underlying page change whilst your test is
		 * executing theresults of future calls against this interface will be against
		 * the freshly loaded page. Synonymfor
		 * org.openqa.selenium.WebDriver.Navigation.to(String).
		 * 
		 * See W3C WebDriver specificationfor more details. Parameters:url The URL to
		 * load. Must be a fully qualified URLSee
		 * Also:org.openqa.selenium.PageLoadStrategy
		 */
		
		
		// internally navigate method is calling get method
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		
		driver.navigate().to(new URL ("https://www.amazon.com"));
		driver.navigate().refresh();
		

	}

}
