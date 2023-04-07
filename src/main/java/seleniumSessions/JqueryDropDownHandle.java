package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();

		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
		// tc1 for single selection
		// selectChoice(choices, "choice 1");
		// tc 2 for single selection
		// selectChoice(choices, "choice 1", "choice 2");
		// tc 3 for all selection
		//selectChoice(choices, "all");
		
		//tc 4 in multi selection on value is wrong
		selectChoice(choices, "choice 1","choice 2","cbdcdscbs");
	}
	public static void selectChoice(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);
		boolean flag = false;
		if (!value[0].equalsIgnoreCase("all")) {
			for (WebElement e : choiceList) {
				String text = e.getText();
				System.out.println(text);
				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						flag = true;
						e.click();
						break;
					}else {
						flag = false;
					}
				}
			}
		} else {
			// logic for all selection
			try {
				for (WebElement e : choiceList) {
					e.click();
					flag = true;
				}
			} catch (ElementNotInteractableException e) {
				System.out.println("all choices are over.....");
			}
		}
		if (flag == false) {
			System.out.println("choice option is not present......"+value[0]);
		}
	}
}
