package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Map {
	WebDriver driver;
	
	@FindBy(how= How.XPATH, using="//*[@id=\"searchboxinput\"]")
	private WebElement searchbar;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"searchbox-searchbutton\"]")
	private WebElement searchbutten;
	
	@FindBy(how = How.XPATH,using ="//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/span/span/span[1]")
	private WebElement ratings;
	
	
	@FindBy(how = How.XPATH,using ="//button[@aria-label='33,011 reviews']")
	private WebElement review;
	
	@FindBy(how = How.XPATH,using ="//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[7]/div[3]/button/div[1]/div[2]/div[1]")
	private WebElement address;
	
	@FindBy(how = How.XPATH,using ="//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[7]/div[5]/a")
	private WebElement site;
	
	@FindBy(how = How.XPATH,using ="//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[7]/div[6]/button/div[1]/div[2]/div[1]")
	private WebElement mob;

	
	
	

	public WebElement getRatings() {
		return ratings;
	}

	public void setRatings(WebElement ratings) {
		this.ratings = ratings;
	}

	public WebElement getReview() {
		return review;
	}

	public void setReview(WebElement review) {
		this.review = review;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getSite() {
		return site;
	}

	public void setSite(WebElement site) {
		this.site = site;
	}

	public WebElement getMob() {
		return mob;
	}

	public void setMob(WebElement mob) {
		this.mob = mob;
	}

	public void setSearchbar(String searchbar) {
		this.searchbar.sendKeys(searchbar);
	}

	public void setSearchbutten() {
		this.searchbutten.click();
	}
	
	public Map(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



}
