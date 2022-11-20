package Tests;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.PageFactory.Map;
import com.utilitis.BaseClass;

public class Task_01 extends BaseClass {
  @Test
  public void task1() throws Exception,IOException   {
	  driver.get(URL);
	  Thread.sleep(3000);
	  
	  Map map = new Map(driver);
	  map.setSearchbar(search);
	  map.setSearchbutten();
	  Thread.sleep(3000);
	  //screenshot(driver);
	String a = driver.getTitle();
	//System.out.println(a);
	assertEquals(a,"Wankhede Stadium - Google Maps");
	System.out.println("Wankhede Stadium - Google Maps is prasent");
	String b = map.getRatings().getText();
	String c = map.getReview().getText();
	System.out.println(b);
	System.out.println(c);
	map.getSite().isDisplayed();
	String d = map.getAddress().getText();
	System.out.println(d);
	map.getMob().isDisplayed();
	//screenshot(driver);
  }
}
