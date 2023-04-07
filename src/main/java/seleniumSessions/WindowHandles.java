package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();

		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		System.out.println(driver.findElement(By.id("windowButton")).getText());

		Set<String> allBrowser = driver.getWindowHandles();

		Iterator<String> itr = allBrowser.iterator();

		while (itr.hasNext()) {

			if (mainWindow != itr.next()) {
			
			driver.switchTo().window(itr.next());
			String sndWindow = driver.getWindowHandle();
			System.out.println(sndWindow);
			String str = driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(str);
			}
			
		}
		
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		//driver.close();
		
		//driver.switchTo().window(mainWindow);
		//String win=driver.getWindowHandle();
		//System.out.println(win);
		//System.out.println(driver.findElement(By.id("tabButton")).getText());


	}

}
