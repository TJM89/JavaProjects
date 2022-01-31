package ShirtDataBase;

public class ShirtDetails {

	String shirtBrand;
	int shirtSize;

	// using Parameterized constructors
	ShirtDetails(String brand) {
		this.shirtBrand = brand;
	}

	ShirtDetails(int size) {
		this.shirtSize = size;
	}

}
