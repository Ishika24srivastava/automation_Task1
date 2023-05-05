package Polymorphism;
class Overload{
	
	void statement(String name) {
	    System.out.println("Hi myself " + name);
	  }
	  // overloading statement method
	  void statement(String fname, String lname) {
	    System.out.println("Hi myself " + fname + " " + lname);
	  }
	}

public class Function_overloading 
{
	public static void main(String[]args) {
	Overload ov=new Overload();
	ov.statement("Ram");
	ov.statement("Ram","Sharma");
}
}
