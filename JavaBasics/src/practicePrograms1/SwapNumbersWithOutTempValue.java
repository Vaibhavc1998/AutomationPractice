package practicePrograms1;

public class SwapNumbersWithOutTempValue {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;

		System.out.println("Before swapping: ");
		System.out.println("First number = " + num1);
		System.out.println("Second number = " + num2);

		num1 = num1 + num2; // 5+10=15
		num2 = num1 - num2; // 15-10=5
		num1 = num1 - num2;

		System.out.println("After swapping: ");
		System.out.println("First number = " + num1);
		System.out.println("Second number = " + num2);
	}

}
// Swap two numbers using a without temporary variable: