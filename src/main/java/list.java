import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class list {

	public static String FirstFactorial(String st) {
	    int xcount = 0; 
		int ocount = 0;
		for(int i = 0; i <= st.length()-1; i++)
	     {
	       if(st.charAt(i)=='x')
	       {
	    	  xcount++; 
	       }
	       else if(st.charAt(i)=='o') {
	    	   ocount++;
	       }
	       else
	       {
	    	   return "emtystring";
	       }
	     }
		if(xcount == ocount)
		{
			return "true";
		}
		else
		{
			return "false";
		}
	  }

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		list m = new list();
		System.out.print(m.FirstFactorial(s.nextLine()));
	}
}