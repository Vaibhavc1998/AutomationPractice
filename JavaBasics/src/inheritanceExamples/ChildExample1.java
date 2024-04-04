package inheritanceExamples;

class ParentExample1{
//	default constructor
//	ParentExample1(){
//		
//	} 
	int age =25;
	static double salary=25000.50;
}


public class ChildExample1 extends ParentExample1{
////	default constructor
//		ChildExample1(){
//			super();
//	}
	
	int empId=100537907;
	static int pinCode=440024;
	
	public static void main(String[] args) {
		
		ChildExample1 e1=new ChildExample1();
		System.out.println("NSGV value of age : "+e1.age);
		System.out.println("NSGV value of empID : "+e1.empId);
		
//		 static member never participate in inheritance 
		System.out.println("SGV of ParentExample1 class salary : "+ParentExample1.salary);
		System.out.println("SGV of ChildExample1 class salary : "+ChildExample1.pinCode);
	}

}
