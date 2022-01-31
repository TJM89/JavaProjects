package CarsDataBase;

public class CarsList {

	String carBrand = "Honda";
	String carName;
	int carNumber;

	// simple constructor
	CarsList() {
	}

	// Parameterized constructor
	CarsList(String carName) {
		this.carName = carName;
	}

	// using the method to call the car Number in CarsMain class
	CarsList(int carNum) {
		carNumber = carNum;
	}

}