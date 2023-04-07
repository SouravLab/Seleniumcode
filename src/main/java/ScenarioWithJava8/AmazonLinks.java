package ScenarioWithJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);

		driver.get("https://amazon.in");
		// with using java 8
		//driver.findElements(By.tagName("a")).stream().map(e -> e.getText()).filter(s -> !s.isBlank()).distinct()
			//	.sorted().filter(s -> s.startsWith("C") || s.startsWith("D")).forEach(s -> System.out.println(s));

		/*
		 * //without using java 8
		 * 
		 * List<WebElement> list = driver.findElements(By.tagName("a"));
		 * 
		 * List<String> text = new ArrayList<String>();
		 * 
		 * for (int i = 0; i < list.size(); i++) { String temp = list.get(i).getText();
		 * 
		 * if (!temp.isBlank()) { text.add(temp); } }
		 * 
		 * Set removeDuplicate = new HashSet<String>(text); List<String>
		 * listAfterRemovingDuplicates = new ArrayList<String>(new
		 * HashSet<String>(removeDuplicate));
		 * Collections.sort(listAfterRemovingDuplicates); for (int i = 0; i <
		 * listAfterRemovingDuplicates.size(); i++) { if
		 * (listAfterRemovingDuplicates.get(i).startsWith("C") ||
		 * listAfterRemovingDuplicates.get(i).startsWith("D")) {
		 * System.out.println(listAfterRemovingDuplicates.get(i)); }
		 * 
		 * }
		 */
		driver.quit();

	}

}
