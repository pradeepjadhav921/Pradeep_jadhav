package Tests;

public class tests123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a = "Pradeep How Are Yo1244@#%6u";
		 String b = a.replaceAll(" ", "");
		 String b1 = b.replaceAll("[a-z A-Z 0-9]", "");
		 System.out.println(b1);
		 
		 int c = 1234;
		 int reverce = 0;
		 while(c!=0)
			 {
			 int reminder = c%10;
			 reverce = 10*reverce + reminder;
			 c = c/10;
			 System.out.println(reverce);
			 }
		 System.out.println(reverce);
	}

}
