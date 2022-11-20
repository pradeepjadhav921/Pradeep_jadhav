package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DataTable {
	
	WebDriver driver;
	
	public DataTable(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"example\"]/thead/tr/th[4]")
	private WebElement age;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"example\"]/tbody//tr")
	private WebElement list;

	public WebElement getAge() {
		return age;
	}

	public WebElement getList() {
		return list;
	}

}
