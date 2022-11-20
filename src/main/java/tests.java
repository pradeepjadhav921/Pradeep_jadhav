import java.util.Scanner;

public class tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		    System.out.print("Enter a Number");
		    System.out.print(StringChallenge(s.nextLine())); 
		  }
	  public static boolean StringChallenge(String str) {
	      int r , sum = 0, temp;
	      int n = 454;
	      temp = n;
	      while(n>0){
	        r=n%10;
	        sum = (sum*10)+r;
	        n=n/10;
	      }
	      if(temp == sum){
	       return true;
	      }
	      else{
	        return false;
	      }
	  }
	  }
