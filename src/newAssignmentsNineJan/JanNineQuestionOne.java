package newAssignmentsNineJan;

import java.util.Scanner;

public class JanNineQuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int desiredTemp = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Set your desired Temperature:");

		desiredTemp = sc.nextInt();
		if (desiredTemp >= 30) {
			System.out.println("WARNING! Temperature too high! set below 30 degrees");
		} else if (desiredTemp <= 10) {
			System.out.println("WARNING! Temperature too low! set above 10 degrees");
		} else {
			System.out.println("Temperature has been set to " + desiredTemp + " degrees");

		}

	}

}
