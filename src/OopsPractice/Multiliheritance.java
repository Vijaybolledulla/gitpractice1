package OopsPractice;

public class Multiliheritance {
	
	public void m1() {
		System.out.println("1 cr asset");
	}
}
	class Father extends Multiliheritance{
		
		public void properties() {
			System.out.println("2 Duplex Houses in KPHP");
		}
		
		public void position() {
			System.out.println("MLA of KPHP");
		}
	}

	class MyChild extends Father{
		
		public void knowledge() {
			System.out.println("MBBS from OU");
		}
		
		public static void main(String[] args) {
			MyChild ref= new MyChild();
			
			ref.m1();
			
			ref.position();
			
			ref.knowledge();
		}
		
	}

	
