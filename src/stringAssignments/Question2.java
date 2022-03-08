package stringAssignments;

public class Question2 {

	public static void main(String[] args) {

		/*
		 * Given a string, String str="100 queen street,Toronto,M5V 3E3 "; , extract
		 * following words and store in 3 different variables as shown below a. String
		 * streetAddress = “100 queen street”; b. String city = “Toronto”; c. String zip
		 * = “M5V 3E3”;
		 */

		String str = "100 queen street,Toronto,M5V 3E3 ";

		String[] address = str.split(",");
		String streetAddress = address[0];
		String city = address[1];
		String zip = address[2];

		System.out.println(streetAddress);
		System.out.println(city);
		System.out.println(zip);
	}

}
