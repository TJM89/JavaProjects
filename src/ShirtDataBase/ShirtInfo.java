package ShirtDataBase;

public class ShirtInfo {

	public static void main(String[] args) {

		ShirtDetails obj1 = new ShirtDetails("LV");
		System.out.println("The shirt brand name is " + obj1.shirtBrand + " one of the luxury brands in the World");

		ShirtDetails obj2 = new ShirtDetails(40);
		System.out.println("The preffered shirt size is " + obj2.shirtSize);

	}

}
