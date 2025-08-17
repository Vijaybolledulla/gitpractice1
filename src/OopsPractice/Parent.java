package OopsPractice;

public class Parent {
	public  void Property() {
		System.out.println("Poperty value is 5cr");
	}

	public void land() {
		System.out.println("land in Maratahalli");
	}
}
	class kid extends Parent{
	
		public void degree() {
			System.out.println("Degree in sv university");
		}
	

	public static void main(String[] args) {
		
		kid ref = new kid();
		ref.degree();
		ref.land();
		ref.Property();
	}


}
