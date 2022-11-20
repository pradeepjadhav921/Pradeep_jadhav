package com.utilitis;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String URL = "https://www.google.com/maps/";
	public String search = "Wankhede Stadium";
	public String URL1 = "http://www.allmovie.com/ ";
	public String URL2 = "https://datatables.net/";
	public String URL3 = "https://www.redbus.in/";
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closs() {
		driver.close();
	}
	
	public void screenshot(WebDriver driver) throws IOException  {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File scr = ss.getScreenshotAs(OutputType.FILE);
		File dsc = new File("C:\\Users\\Jadha\\eclipse-workspace\\practice\\TestData");
		FileUtils.copyFile(scr,dsc);
	}
}
