package methodsAssignment;

public class EmployeeData {

	String firstName = "Albert";
	String lastName = "Samuel";
	double hourlyRate = 25.75;
	double hoursWorked = 37.5;
	double weeklySalary = 0;
	double updatedweeklySalary = 0;

	String getfirstName() {
		return firstName;
	}

	String getlastName() {
		return lastName;
	}

	double gethourlyRate() {
		return hourlyRate;
	}

	double gethoursWorked() {
		return hoursWorked;
	}

	double weeklySalary() {
		return weeklySalary;
	}
	
	void setfirstName(String updatedName) {
		firstName = updatedName;
	}

	void setlastName(String updatedName) {
		lastName = updatedName;
	}

	void sethourlyRate(double updatedRate) {
		hourlyRate = updatedRate;
	}
	
	void sethoursWorked(double updatedhoursWorked) {
		hoursWorked = updatedhoursWorked;
	}
	
	void setweeklySalary(double weeklySalary) {
		weeklySalary = updatedweeklySalary;
	}

	double getweeklySalary(double weeklySalary) {
		weeklySalary = hourlyRate*hoursWorked;
		return weeklySalary;
	}

}
