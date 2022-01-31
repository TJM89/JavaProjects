package gamingConsole;

public class GamingConsoleDatabase {

	String consoleBrand;
	int consoleAvailability;
	boolean isConsoleOn = true;

	GamingConsoleDatabase(String brand) {
		this.consoleBrand = brand;
	}

	GamingConsoleDatabase(int availability) {
		this.consoleAvailability = availability;
	}

	GamingConsoleDatabase(boolean turnedOn) {
		this.isConsoleOn = turnedOn;
	}
}
