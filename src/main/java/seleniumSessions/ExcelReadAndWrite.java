package seleniumSessions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReadAndWrite {

	public static void main(String[] args) throws Throwable, InterruptedException {

		File file = new File("C:\\Users\\Sourav\\Desktop\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		String uid;
		String pwd;

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			uid = sheet.getRow(i).getCell(0).getStringCellValue();
			pwd = sheet.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uid);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			// Boolean
			// flag=driver.findElement(By.xpath("//input[@placeholder='Search']")).();

			try {

				driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed();

				FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Sourav\\Desktop\\TestData.xlsx");

				XSSFCell cell = sheet.getRow(i).createCell(2);
				cell.setCellValue("PASS");
				wb.write(outputStream);
				wb.close();

			} catch (Exception e) {

				FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Sourav\\Desktop\\TestData.xlsx");

				XSSFCell cell = sheet.getRow(i).createCell(2);
				cell.setCellValue("Fail");

				wb.write(outputStream);
				wb.close();

			}

			/*
			 * String url =driver.getCurrentUrl();
			 * 
			 * if (url.contains("viewEmployeeList")) {
			 * 
			 * FileOutputStream outputStream = new
			 * FileOutputStream("C:\\Users\\Sourav\\Desktop\\TestData.xlsx");
			 * 
			 * XSSFCell cell = sheet.getRow(i).createCell(2); cell.setCellValue("PASS");
			 * wb.write(outputStream); wb.close(); } else {
			 * 
			 * FileOutputStream outputStream = new
			 * FileOutputStream("C:\\Users\\Sourav\\Desktop\\TestData.xlsx");
			 * 
			 * XSSFCell cell = sheet.getRow(i).createCell(2); cell.setCellValue("Fail");
			 * 
			 * wb.write(outputStream); wb.close(); }
			 */
		}

	}
}
