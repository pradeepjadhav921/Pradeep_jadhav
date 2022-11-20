import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello    i  am  pradeep";
		StringBuffer bf = new StringBuffer(s);
		String[] a = s.split("[ ]+");
		for(String q : a) {
			System.out.println(q);
		}
		System.out.println(bf.reverse());
		
     
	} 

}
