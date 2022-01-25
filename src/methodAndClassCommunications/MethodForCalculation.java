package methodAndClassCommunications;

import java.util.Scanner;

public class MethodForCalculation {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");

		num1 = sc.nextInt();

		System.out.println("Enter second number");
		num2 = sc.nextInt();

		MethodWithCalculationsData methodWithArgumentinput = new MethodWithCalculationsData();

		methodWithArgumentinput.addingTwoNumbers(num1, num2);
		methodWithArgumentinput.substractTwoNumbers(num1, num2);
		
	}

}
