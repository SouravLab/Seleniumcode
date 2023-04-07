package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/asia-cup-2022-1327237/india-vs-pakistan-8th-match-super-four-1327276/full-scorecard");
	WebElement batsman=	driver.findElement(By.xpath("//a[@title='Virat Kohli']/parent::td/following-sibling::td/span"));
	System.out.println(batsman.getText());
	
	
	
	//table[@id='customers']//tr
	//(//table[@id='customers']//tr)[1]/th
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
