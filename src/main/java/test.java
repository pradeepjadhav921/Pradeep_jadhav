import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class test {

	public static void main(String[] args) {
			String inputString = "Hi i am pradeep jadhav";
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	        char[] strArray = inputString.toCharArray();
	        
	        for (char c : strArray) {
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            }
	            else {
	                charCountMap.put(c, 1);
	            }
	        }
	        for (Map.Entry entry : charCountMap.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }		
}  
}
