package AssignmentJanuary14;

import java.util.Scanner;

public class Question3Phones {

	public static void main(String[] args) {

		String phoneName = "";
		Scanner sc = new Scanner(System.in);

		// array of phones are created below
		String samsungPhones[] = { "S20", "S21", "Flip3", "Fold3" };
		
		String googlePhones[] = { "Googlepixel 6", "Googlepixel 6 pro", "Googlepixel pro", "Googlepixel 5" };

		String iPhones[] = { "iPhone12", "iPhone 12 mini", "iPhone11", "iPhone 11 mini" };

		System.out.println("Please enter the desired phone name: ");
		phoneName = sc.next();

			for(int i=0;i<samsungPhones.length;i++)
			if (samsungPhones[i].equals(phoneName))

			{
				System.out.println("Product selected is " + samsungPhones[i]);
				break;

			} 
			
			for(int i=0;i<googlePhones.length;i++)
			if (googlePhones[i].equals(phoneName)) {
				System.out.println("Product selected is " + googlePhones[i]);
				break;
			}

			for(int i=0;i<iPhones.length;i++)
			if (iPhones[i].equals(phoneName)) {
				System.out.println("Product selected is " + iPhones[i]);
				break;
			}

			else {
				System.out.println("Invalid entry, please select from the list");
				break;
			}

	}

}
