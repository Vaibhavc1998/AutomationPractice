package inheritanceExamples;
class Testing{
	int age=25;
	static double salary=25000.50;
}

public class Example1 {
	int empId=100537907;
	static int pincode=440024;
	
	public static void main(String[] args) {
		
		// Static Member
	
		System.out.println("Static Global Variable of Testing Class Salary: "+Testing.salary);
		System.out.println("Static Global Variable of Example1 Class: "+Example1.pincode);
		
		// Non Static Member
		
		Testing t1=new Testing();
		System.out.println("NSGV of Testing Class Salary: "+t1.age);
		
		Example1 e1=new Example1();
		System.out.println("NSGV of Example1 Class empId: "+e1.empId);

	}

}
