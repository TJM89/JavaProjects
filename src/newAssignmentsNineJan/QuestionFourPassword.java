package newAssignmentsNineJan;

import java.util.Scanner;

public class QuestionFourPassword
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName = "pivotAdmin";
		String passwordUsed = "Admin123";

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the username:");
		userName = sc.next();
		System.out.println("Please enter the password:");
		passwordUsed = sc.next();
		
		// first try

		if (userName.equals("pivotAdmin") && passwordUsed.equals("Admin123"))

			System.out.println("You are logged in to the application");

		else if (!userName.equals("pivotAdmin") && !passwordUsed.equals("Admin123")
				|| userName.equals("pivotAdmin") && !passwordUsed.equals("Admin123")
				|| !userName.equals("pivotAdmin") && passwordUsed.equals("Admin123"))

			System.out.println("Incorrect User id or password. Try again");

		

		// second try

		System.out.println("Please enter the username:");
		userName = sc.next();
		System.out.println("Please enter the password:");
		passwordUsed = sc.next();
		if (userName.equals("pivotAdmin") && passwordUsed.equals("Admin123"))

			System.out.println("You are logged in to the application");

		else if (!userName.equals("pivotAdmin") && !passwordUsed.equals("Admin123")
				|| userName.equals("pivotAdmin") && !passwordUsed.equals("Admin123")
				|| !userName.equals("pivotAdmin") && passwordUsed.equals("Admin123"))

			System.out.println("Incorrect User id or password. Try again");

		// third try

		System.out.println("Please enter the username:");
		userName = sc.next();
		System.out.println("Please enter the password:");
		passwordUsed = sc.next();
		if (userName.equals("pivotAdmin") && passwordUsed.equals("Admin123"))

			System.out.println("You are logged in to the application");

		else

			System.out.println("Maximum attempts reached. Account locked!");

	}
}


