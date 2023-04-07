package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownConcept {
static WebDriver driver;
	public static void main(String[] args) {
		
		// hrtml tag should be select
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		By country=By.id("Form_getForm_Country");
		
		//sel.selectByVisibleText("India");
		//sel.selectByValue("Australia");
		//WebElement country_ele=driver.findElement();
		
		doSelectDropDownByIndex(country, 5);
		
	}
	public static WebElement getElement(By loactor) {
		return driver.findElement(loactor);
	}
	
      public static void doSelectDropDownByIndex(By locator,int index) {
  		Select sel =new Select(getElement(locator));
  		sel.selectByIndex(index);
      }
      
      public static void doSelectDropDownByVisibleText(By locator,int index) {
    		Select sel =new Select(getElement(locator));
    		sel.selectByIndex(index);
        }
      public static void doSelectDropDownByValuet(By locator,int index) {
    		Select sel =new Select(getElement(locator));
    		sel.selectByIndex(index);
        }
      
      
      
      
      
}
