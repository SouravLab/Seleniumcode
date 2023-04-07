package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;
	public static void main(String[] args) {
		//WAP
		// 1. Total img
		// 2. Print the src value
		// 3. print the alt value
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	    List<WebElement> imageList=	driver.findElements(By.tagName("img"));
		System.out.println("toatal images : " +imageList.size());
		
//		for(WebElement e:imageList) {
//			String attVal=e.getAttribute("alt");
//			String srcVal=e.getAttribute("src");
//			System.out.println(attVal +" :"+srcVal);
//		}
	By links= By.tagName("a");
	By images= By.tagName("img");
	//System.out.println(getElementCount(links));
	//System.out.println(getElementCount(images));
	printElementsTextList(links);
	if (getElementsTextList(links).contains("Registry")) {
		//System.out.println("Registry is present");
		
	}
	System.out.println(getElementsAttributeList(images, "src"));
		
	}
	 
	
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		public  static int getElementCount(By locator) {
			return getElements(locator).size();
		}
		
		public static void printElementsTextList(By locator) {
			List<WebElement> elelist=getElements(locator);
			for(WebElement e :elelist) {
				String text=e.getText();
				if (!text.isEmpty()) {
				
					System.out.println(text);
				}
			}
		}
		public static List<String> getElementsTextList(By locator) {
			List<WebElement> elelist=getElements(locator);
			
			List<String> eleTextList=new ArrayList<String>();
			for(WebElement e :elelist) {
				String text=e.getText();
				if(!text.isEmpty()) {
				eleTextList.add(text);
				}
			}
			return eleTextList;
		}
		
		
		public static List<String> getElementsAttributeList(By locator, String attrName) {
			List<WebElement> elelist=getElements(locator);
			List<String> eleAttrlist=new ArrayList<String>();
			
			for(WebElement e : elelist) {
				String attrval=e.getDomAttribute(attrName);
				eleAttrlist.add(attrval);
			}
			return eleAttrlist;
			
		}
		
	}


