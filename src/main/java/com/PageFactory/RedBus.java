package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RedBus {
	WebDriver driver;
	public RedBus(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how= How.XPATH , using = "//*[@id=\"src\"]")
	private WebElement from;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"dest\"]")
	private WebElement to;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"search_btn\"]")
	private WebElement searchbutton;
	
	@FindBy(how = How.XPATH , using = "//td[@class='current day']")
	private WebElement date;
	
	@FindBy(how = How.XPATH , using = "(//div[@class='w-10 fl f-12 d-color'])[4]")
	private WebElement rating;			
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")
	private WebElement mum;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")
	private WebElement pun;
	
	public WebElement getMum() {
		return mum;
	}

	public WebElement getPun() {
		return pun;
	}

	public WebElement getFrom() {
		return from;
	}


	public WebElement getTo() {
		return to;
	}


	public WebElement getSearchbutton() {
		return searchbutton;
	}


	public WebElement getDate() {
		return date;
	}


	public WebElement getRating() {
		return rating;
	}

}
