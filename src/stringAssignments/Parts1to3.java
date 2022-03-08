package stringAssignments;

import java.util.Scanner;

public class Parts1to3 {

	public static void main(String[] args) {

		// Part 1
		String cityNames[] = new String[] { "Toronto", "Malton", "Whitby", "Cochin" };

		// Part2
		String cityName = "Toronto,Malton,Whitby,Cochin";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a city name : ");
		String city = sc.next();

		if (cityName.contains(city)) {
			System.out.println("City name found");
		} else {
			System.out.println("City not found in the list");

		}

		// Part3
		String cityNaming = "Toronto";

		if (cityNaming.startsWith("T")) {
			cityNaming.replace("T", "Mississauga");

		}

	}

}
