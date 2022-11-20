
public class prd {

	public static void main(String[] args) {
		c1 c = new c2();
		c.m1();

		}
}
		
	class c1 {
			
			public void m1() {
				System.out.println("this is parent class");
			}
			
		}
	
	class c2 extends c1 {
		public void m1() {
			System.out.println("this is child class");
		}
	}
		

