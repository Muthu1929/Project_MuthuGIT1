package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassAdactin {

	public static WebDriver driver;

	public static WebDriver lunchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void urllunch(String u) {
		driver.get(u);
		driver.manage().window().maximize();
	}

	public static void browserWait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}

	public static void SendKeys(WebElement e, String target ) {

		e.sendKeys(target);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void browserquit() {
		driver.quit();

	}

	public String gettext(WebElement e) {
		return e.getText();
	}

	public static String getattribute(WebElement e, String value) {
		return e.getAttribute("value");
	}

	public static void movetoWebElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(source, target).perform();
	}

	public static void Contextclick() {
		Actions a1 = new Actions(driver);
		a1.contextClick().perform();
	}
	
	public void TakesScreenshot(String s) throws IOException {	
		
	TakesScreenshot firstpage = (TakesScreenshot) driver;
	File sor = firstpage.getScreenshotAs(OutputType.FILE);
	File des = new File("src\\test\\resources\\Reports"+s+ ".png");
	//FileUtils.copyFile(sor, des);
	}
	
	public void selectByIndex (WebElement e, int n) {
		Select s=new Select (e);
		s.selectByIndex(n);
	}
	
	
	public static String ReadExcel ( String sheetName, int rowNo, int cellNo) throws IOException {
		File loc = new File(
				"C:\\Users\\Lenovo\\eclipse-workspace\\Junit7.30\\src\\test\\resources\\Excel\\Maven_POI_data.xlsx");
		FileInputStream fi = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rowNo);
		Cell cell = r.getCell(cellNo);
		int type = cell.getCellType();
		// 1---- STRING
		// 0--Number,DATE
		String value = null;
		if (type == 1) {
			value = cell.getStringCellValue();
		} else {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
				value = sd.format(d);
			} else {
				double db = cell.getNumericCellValue();
				long l = (long) db;
				value = String.valueOf(1);
			}
		}

		return value;
	}


	
	
	

	
	
	
	}
		
		
		
	


