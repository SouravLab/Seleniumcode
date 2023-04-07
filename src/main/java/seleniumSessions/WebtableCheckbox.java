package seleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableCheckbox {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//selectEmp("Joe.Root");
		//selectEmp("John.Smith");
		getTableData("John.Smith");

	}
	////a[text()= 'Joe.Root']/parent::td/preceding-sibling::td/child::input
	public static void selectEmp(String name) {
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/child::input
		WebElement checkBox = driver.
				findElement
				(By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/child::input"));
		checkBox.click();		
	}
	//'"+name+"'
	
	//a[text()='John.Smith']/parent::td/following-sibling::td
	public static void getTableData(String name) {
      //driver.findElements(By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td"));)
		
List<WebElement> list=	driver.findElements(By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td"));
for(WebElement e: list) {
	String text=e.getText();
	System.out.println(text);
}


		
	}
}