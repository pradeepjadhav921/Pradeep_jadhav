package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.PageFactory.RedBus;
import com.utilitis.BaseClass;
import com.utilitis.dataprovider;

public class Task_05 extends BaseClass {
  @Test
  public void Task_5() throws Exception {
	  driver.get(URL3);
	  RedBus rb = new RedBus(driver);
	  dataprovider data = new dataprovider();
	  rb.getFrom().sendKeys("mumbai");
	  rb.getMum().click();
	  rb.getTo().sendKeys("pune");
	  rb.getPun().click();
	  Thread.sleep(3000);
	  rb.getDate().click();
	  rb.getSearchbutton().click();
	  
	  Thread.sleep(10000);
	  rb.getRating().click();
	  String star = "(//div[@class='rating-sec lh-24'])";
	  String name = "(//div[@class='travels lh-24 f-bold d-color'])";
	  int raw = 0;
	  int raw2 = 1;
	  //String a1 = driver.findElement(By.xpath(star)).getText();
	  //System.out.println(a);
	  List<WebElement> list = driver.findElements(By.xpath("Stars"));
	  for(int i = 1;i<26;i++) {
		  System.out.println(i);
		  String ratting = driver.findElement(By.xpath(star+"["+i+"]")).getText();
		  String busname = driver.findElement(By.xpath(name+"["+i+"]")).getText();
		  System.out.print(ratting);
		  System.out.print(busname);
		  Thread.sleep(1000);
		  data.writedata("Sheet1", raw, i, busname);
		  data.writedata("Sheet1", raw2, i, ratting);  
	  }
	  
  }
  
}
