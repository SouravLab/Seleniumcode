package seleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakescreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co");
      
		Calendar cal=Calendar.getInstance();
		Date time= cal.getTime();
		System.out.println(time);
		String timestamp=time.toString().replace(":", "").replace(" ", "");
		
	//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(src, new File ("./AllScreenShot"+timestamp+".jpg"));
		
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File scrfile=ts.getScreenshotAs(OutputType.FILE);
	File file=new File("./AllScreenShot"+timestamp+".jpg");
	FileUtils.copyFile(scrfile, file);
	
	
			
	}

}
