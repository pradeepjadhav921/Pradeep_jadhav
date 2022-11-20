package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PageFactory.movie;
import com.utilitis.BaseClass;

public class Task_02 extends BaseClass{
	
	SoftAssert softassert = new SoftAssert();
  @Test
  public void task_2() throws Exception {
	  
	  driver.get(URL1);
	  movie ms = new movie(driver);
	  ms.setSearchbox("The Godfather");
	  Thread.sleep(3000);
	 // WebElement element = ms.getSearchlist();
	  List<WebElement> list = driver.findElements(By.xpath("//section[@class='movie-results']//li"));
	  System.out.println(list.size());
	  for(WebElement elements:list) { 
		  String movies = elements.getText();
		 // System.out.println(movies);
		  String year = movies.replaceAll("[^0-9]", "");
		  System.out.println(year);
		  if(year.equalsIgnoreCase("1972")) {
			  elements.click();
			  Thread.sleep(3000);
		  }
	  }
	  System.out.println("qwer");
		String generic = ms.getCrime().getText();
		System.out.println(generic);
		softassert.assertTrue(generic.contains("Crime")); 
		
		 
		 String mpaa = ms.getMpaa().getText();
		 System.out.println(mpaa);
		 System.out.println(mpaa.length()-1);
		 int i = mpaa.length()-1;
		 char R= mpaa.charAt(i);
		softassert.assertTrue('R'==R);
		 
		 ms.getCast_Crew().click();
		 String castrole = ms.getCastrole().getText();
		 softassert.assertTrue(castrole.contains("Michael Corleone"));
  }
}
