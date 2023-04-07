package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	private WebDriver driver;
	
	
	
	/**
	 * This method is used to initialize the driver on the basic of browser name.
	 * 
	 * @param browser
	 * @return This returns webdriver
	 */
	/*
	 * public WebDriver launchBrowser(String browser) {
	 * 
	 * System.out.println("browser name is: " + browser);
	 * 
	 * if (browser.equalsIgnoreCase("firefox")) {
	 * //System.setProperty("webdriver.gecko.driver",
	 * "C:\\Users\\Sourav\\Desktop\\geckodriver.exe");
	 * WebDriverManager.firefoxdriver().setup();  driver = new
	 * FirefoxDriver(); } else if (browser.equalsIgnoreCase("chrome")) {
	 * //System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Sourav\\Desktop\\chromedriver.exe");
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); } else
	 * { System.out.println("please pass the right browser"); }
	 * 
	 * return driver; }
	 */
	public WebDriver launchBrowser(String browser) {
		
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup(); 
			 driver = new FirefoxDriver();

		default:
			break;
		}
		return driver;
		
		
	}
	
	
	
	

	/**
	 * 
	 * @param url
	 */
	public void enterUrl(String url) {

		System.out.println("url is " + url);

		if (url.contains("http") || url.contains("https")) {
			driver.get(url);
		} else {
			System.out.println("incorrect url....");
			try {
			throw new Exception("INCORRECT URL MISSING HTTP OR HTTPS");
			}catch(Exception e) {
			
			}
		}

	}

	/**
	 * This method is used for get title of the page
	 * 
	 * @return title of the page
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * This method is used for get page url of the page
	 * 
	 * @return current url
	 */

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * This method is used for quit the entire browser
	 * 
	 * @return
	 */
	public void quitBrowser() {
		driver.quit();
	}

	/**
	 * This method is used for close the current browser
	 * 
	 * @return
	 */
	public void closeBrowser() {
		driver.close();
	}

}
