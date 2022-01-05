package iFElseIfAssignment;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 820;
		int num3 = 1200;
		if (num1 > num2) {
			System.out.println("num1 is greater");
		} else if (num1 == num2) {
			System.out.println("num1 and num2 are equal");
		} else {
			System.out.println("num1 is less than num2");

		}
		if (num2 > num3) {
			System.out.println("num2 is greater");
		} else if (num2 == num3) {
			System.out.println("num2 and num3 are equal");
		} else {
			System.out.println("num2 is less than num3");
			if (num1 > num3) {
				System.out.println("num1 is greater");
			} else if (num1 == num3) {
				System.out.println("num1 and num3 are equal");
			}
			if (num3 > num2) {
				System.out.println("num3 is greater");
			} else if (num3 == num2) {
				System.out.println("num3 and num2 are equal");
			} else {
				System.out.println("num3 is less than num3");

			}

		}
	}

}
