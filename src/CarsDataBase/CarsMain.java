package CarsDataBase;

public class CarsMain {

	public static void main(String[] args) {

		// calling car brand using simple constructor by giving a hard coded value for
		// the brand
		CarsList obj1 = new CarsList();
		System.out.println("Car brand is " + obj1.carBrand);
		// Using Parameterized constructor from CarsList to print the Car Name by
		// setting an object
		CarsList obj2 = new CarsList("Honda-CRV");
		System.out.println("Car name is " + obj2.carName);

		// using a method to call car number

		CarsList obj3 = new CarsList(369);
		System.out.println("Car number is " + obj3.carNumber);

	}

}
