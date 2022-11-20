package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.PageFactory.DataTable;
import com.utilitis.BaseClass;

public class Task_04 extends BaseClass {
  @Test
  public void Test_4() throws Exception {
	  driver.get(URL2);
	  Thread.sleep(3000);
	  DataTable dt = new DataTable(driver);
	  
	  dt.getAge().click();
	  
	  List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody//tr"));
	  for(WebElement element :list) {
			  String a = element.getText();
			  String b = a.replaceAll("[^0-9]", "");
			  System.out.println(a);
			  if(b=="39") {
				  break;
			 }		  
		  }
  }
}
