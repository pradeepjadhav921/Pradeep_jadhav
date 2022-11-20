package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class movie {
	
	WebDriver driver;
	
	public movie(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div/div/div[2]/form/input[2]")
	private WebElement searchbox;
	
	@FindBy(how = How.XPATH, using = "//section[@class='movie-results']//li" )
	private WebElement searchlist;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cmn_wrap\"]/div[2]/div[2]/header/div/span[1]")
	private WebElement crime;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cmn_wrap\"]/div[2]/div[2]/header/div/span[6]")
	private WebElement mpaa;
	
	@FindBy(how = How.XPATH, using ="/movie/the-godfather-v20076/cast-crew")
	private WebElement Cast_Crew;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cmn_wrap\"]/div[2]/div[2]/section/div[2]/div[2]")
	private WebElement castrole;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public void setSearchbox(String a) {
		this.searchbox.sendKeys(a);;
	}

	public WebElement getSearchlist() {
		return searchlist;
	}

	public void setSearchlist(WebElement searchlist) {
		this.searchlist = searchlist;
	}

	public WebElement getCrime() {
		return crime;
	}

	public void setCrime(WebElement crime) {
		this.crime = crime;
	}

	public WebElement getMpaa() {
		return mpaa;
	}

	public void setMpaa(WebElement mpaa) {
		this.mpaa = mpaa;
	}

	public WebElement getCast_Crew() {
		return Cast_Crew;
	}

	public void setCast_Crew(WebElement cast_Crew) {
		Cast_Crew = cast_Crew;
	}

	public WebElement getCastrole() {
		return castrole;
	}

	public void setCastrole(WebElement castrole) {
		this.castrole = castrole;
	}
	
}
