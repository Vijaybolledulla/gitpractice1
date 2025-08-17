package Methodoverriding;

// extending the properties from parent to child and child wishes to do anything as per child requiremnt
public class Testdemo {
		public void asset() {
			System.out.println("1 cr property");
		}
		
		public void m2() {
			System.out.println("m2 of parent");
		}

	}
	class ChildC extends Testdemo{
		
		public void asset() {
			System.out.println("50 lc property");
		}
		
		public void m1() {
			System.out.println("m1 in child");
		}
		
		public static void main(String[] args) {
			
			  ChildC c= new ChildC();
			  
			  c.asset();
			  c.m2();
			  c.m1();
			 
			
			/*
			 * Parent p= new Parent(); p.asset();
			 */
		}
	}


