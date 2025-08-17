package Abstract;

public abstract class Testdemo {
	
	public void addition(int a , int b) { // declaration
		int c = a+b;
		System.out.println(c); // iMplementation
		//this is a concrete method and it has both declaration and implementation
		
	}
	
	public void division(int a, int b) { //declaration
		int c = a/b;
		System.out.println(c); //Implementation
	}
	
	abstract void  subtraction(int a,int b); // only declaration

}
class Test extends Testdemo{

	@Override
	void subtraction(int a, int b) {
		int  c= a-b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.addition(10, 200);
		t.subtraction(90,50);
		t.division(10, 2);
		
		
	}
	 

}
