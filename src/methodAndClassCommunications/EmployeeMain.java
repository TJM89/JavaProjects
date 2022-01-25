package methodAndClassCommunications;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		double noOfHoursWorked = 0.0;

		EmployeeData firstNameobj = new EmployeeData();
		EmployeeData lastNameobj = new EmployeeData();
		EmployeeData hourlyRateobj = new EmployeeData();

		String firstName = "";
		firstName = firstNameobj.getfirstName();
		System.out.println("Employee first name is " + firstName);
		String lastName = "";
		lastName = lastNameobj.getlastName();
		System.out.println("Employee last name is " + lastName);
		double hourlyRate = 0;
		hourlyRate = hourlyRateobj.hourlyRate();
		System.out.println("Hourly pay rate of " + firstName.concat(lastName) + " is $" + hourlyRate);

		firstName = "";
		firstNameobj.setfirstName("Riyaz");
		firstName = firstNameobj.getfirstName();
		System.out.println("Updated first name of employee to " + firstName);

		lastName = "";
		lastNameobj.setlastName("Khan");
		lastName = lastNameobj.getlastName();
		System.out.println("Updated last name of employee to " + lastName);

		hourlyRate = 0;
		hourlyRateobj.sethourlyRate(35.50);
		hourlyRate = hourlyRateobj.hourlyRate();
		System.out.println("Updated hourly pay rate of " + firstName.concat(lastName) + " is $" + hourlyRate);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of hours worked by " + firstName.concat(lastName) + " :" );
		noOfHoursWorked = sc.nextDouble();

		System.out.println("Enter the hourly rate of the employee :");
		hourlyRate = sc.nextDouble();

		System.out.println("Weekly salary of " + firstName.concat(lastName) + " is $" + noOfHoursWorked * hourlyRate);

	}
}