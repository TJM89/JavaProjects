package assignmentBanquetHall;

import java.util.Scanner;

public class BanquetMain {

	public static void main(String[] args) {
		BanquetDetails banquet = new BanquetDetails();

		Scanner sc = new Scanner(System.in);
		System.out.println("$$$ Welcome to MAJESTIC BANQUET HALL online booking system $$$");
		System.out.println("");
		System.out.println("---Please enter the values based on your requirments---");
		System.out.println();
		System.out.println("Enter the number of guests :");

		int guestNo = sc.nextInt();
		if (guestNo == 0) {
			System.out.println("Please enter a valid guest number, greater than 0");
		}

		else

		{
			System.out.println("Enter the base booking cost for " + guestNo + " guests :");
			double bookingCost = sc.nextDouble();
			banquet.setBookingCost(bookingCost);
			if (bookingCost < 100) {
				System.out.println("Base booking cost cannot be less than $100");
			} else {
				System.out.println("Please enter the food cost for " + guestNo + " guests :");
				double foodCost = sc.nextDouble();
				banquet.setFoodCost(foodCost);
				if (foodCost == 0) {
					System.out.println("The food cost cannot be 0");
				}

				else {
					System.out.println("Enter the beverage cost for " + guestNo + " guests :");
					double beverage = sc.nextDouble();
					banquet.setBeverage(beverage);

					if (beverage == 0) {
						System.out.println("Beverage cost must be included to procceed further");
					} else {
						System.out.println("Enter the tip amount in $:");
						banquet.setTip(sc.nextDouble());

						double baseCost = banquet.calculateBaseCost(banquet.getBookingCost(), banquet.getFoodCost(),
								banquet.getTip(), banquet.getBeverage());

						double tax = banquet.calculateTax(baseCost);

						double cessAmount = banquet.calculateCess(guestNo, baseCost);

						banquet.calculateTheTotalCost(baseCost, tax, cessAmount);

					}
				}
			}
		}
	}
}