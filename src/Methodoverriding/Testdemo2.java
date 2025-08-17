package Methodoverriding;

public class Testdemo2 {
	
	public void marry() {
		System.out.println("subbamaa");
	}
	public void dowry() {
		System.out.println("1 cr");
	}
}
	class Childcc extends Testdemo2{
	public void marry() {
		System.out.println("Marry Rashmika");
	}
		
		public static void main(String[] args) {
		
		Childcc C =new Childcc();
		 C.marry();
		 C.dowry();
		
			/*
			 * Testdemo2 c2 = new Testdemo2(); c2. marry(); c2.dowry();
			 */
		}

}
