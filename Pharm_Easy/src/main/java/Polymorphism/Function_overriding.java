package Polymorphism;

class Parent {
	  // creating print method
	  void print() {
	    System.out.println("Hi I am parent");
	  }
	}

class Child extends Parent {
	  // overriding print method
	  void print() {
	    System.out.println("Hi I am children");
	  }
	}

public class Function_overriding {
	public static void main(String[] args) {
	    // creating instance of parent
	    Parent obj1;
	    obj1 = new Parent();
	    obj1.print();
	    obj1 = new Child();
	    obj1.print();

}
}
