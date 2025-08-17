package Mehodoverloading;

public class Testdemo {

//if a class contains with more than one method with same name and different argument parameters is called mrthodoverloading
	
	public void M1(int x) {
		System.out.println(x);
	}
	
	public void M1(String x) {
		System.out.println(x);
	}
public static void main(String[] args) {
	
	Testdemo ref = new Testdemo();
	ref.M1(10);
	ref.M1("Vijay");
	
}
	}


