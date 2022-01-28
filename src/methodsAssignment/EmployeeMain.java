package methodsAssignment;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeData firstNameobj = new EmployeeData();
		EmployeeData lastNameobj = new EmployeeData();
		EmployeeData hourlyRateobj = new EmployeeData();
		EmployeeData hoursWorkedobj = new EmployeeData();
		EmployeeData weeklySalaryobj = new EmployeeData();

		String firstName = "";
		firstName = firstNameobj.getfirstName();
		System.out.println("Employee first name is " + firstName);
		firstName = "";
		firstNameobj.setfirstName("Abraam");
		firstName = firstNameobj.getfirstName();
		System.out.println("Updated first name of employee to " + firstName);

		String lastName = "";
		lastName = lastNameobj.getlastName();
		System.out.println("Employee last name is " + lastName);
		lastName = "";
		lastNameobj.setlastName("Thomas");
		lastName = lastNameobj.getlastName();
		System.out.println("Updated last name of employee to " + lastName);

		double hourlyRate = 20;
		hourlyRate = hourlyRateobj.gethourlyRate();
		System.out.println("The intital hourly pay rate was $" + hourlyRate);
		hourlyRateobj.sethourlyRate(35.50);
		hourlyRate = hourlyRateobj.gethourlyRate();
		System.out.println("Updated hourly pay rate of " + firstName.concat(lastName) + " is $" + hourlyRate);

		
		double hoursWorked = 0;
		hoursWorked = hoursWorkedobj.gethoursWorked();
		hoursWorkedobj.sethoursWorked(hoursWorked);;
		hoursWorked = hoursWorkedobj.gethoursWorked();
		System.out.println("The no. of hours worked by " + firstName + " is " + hoursWorked + " hrs");
		
		
		double weeklySalary = 0;
		weeklySalary = weeklySalaryobj.getweeklySalary(weeklySalary);
		weeklySalaryobj.setweeklySalary(weeklySalary);
		weeklySalary = weeklySalaryobj.getweeklySalary(weeklySalary);
		
		System.out.println("The weekly salary of " + firstName + " is $" + weeklySalary);
	}
}