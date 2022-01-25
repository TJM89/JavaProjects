package methodAndClassCommunications;

public class EmployeeData {

	String firstName = "Albert";
	String lastName = "Samuel";
	double hourlyRate = 25.75;
	double hoursWorked = 0;

	String getfirstName() {
		return firstName;
	}

	String getlastName() {
		return lastName;
	}

	double hourlyRate() {
		return hourlyRate;
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
	
	
	
}
