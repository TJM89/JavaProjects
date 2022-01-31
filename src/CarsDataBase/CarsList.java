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

	CarsList(int carNum) {
		this.carNumber = carNum;
	}

}