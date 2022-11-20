package Tests;

import org.testng.annotations.Test;
import org.testng.collections.Lists;

public class NewTest {
  @Test
  public void f() {
	  int a[]={33,3,4,5};
	  min(a);
	    
  }
  static void min(int arr[]){
	  char[] copyFrom = { '1', '2', '3', '4', '5'};
      char[] copyTo = new char[5];
      

      System.arraycopy(copyFrom,0, copyTo,1,4);
      
      System.out.println(copyTo);
      System.out.println(copyFrom);
      System.out.println(new String(copyTo));
      

  }
}
