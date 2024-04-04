package Day15.Constructor;

public class Example1 {
	int age;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		//to load non-static members into the memory		
		Example1 ref=new Example1();
		System.out.println("age: "+ref.age);
		
		System.out.println("Program Ends");
			
	}

}

/**
Constructor is use to initialize non-static members of the class.
it is similar to a method but it won't have return type and 
its name should be same as class name.

Constructor get called automatically when class instance/object is created

type:	
 1: default - this will be written by java compile when any class doesn't contain any type constructor. 
 			  it won't have any parameter as well as its body will be empty.
 2: user defined - this will be written by java programmer, it can have parameter and it will have body as well
 
 NOTE: every java class will have a constructor
*/



