package assignmentBanquetHall;

import java.util.Scanner;

public class BanquetMain {

	public static void main(String[] args) {
		BanquetDetails banquet = new BanquetDetails();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of guests :");
		int guestNo = sc.nextInt();
		if (guestNo == 0) {
			System.out.println("Please enter a valid guest number, greater than 0");
		} else

			System.out.println("Enter the base booking cost for " + guestNo + " guests :");
		banquet.setBookingCost(sc.nextDouble());

		System.out.println("Please enter the food cost for " + guestNo + " guests :");
		banquet.setFoodCost(sc.nextDouble());

		System.out.println("Enter the beverage cost for " + guestNo + " guests :");
		banquet.setBeverage(sc.nextDouble());

		System.out.println("Enter the tip amount in $:");
		banquet.setTip(sc.nextDouble());

		double baseCost = banquet.calculateBaseCost(banquet.getBookingCost(), banquet.getFoodCost(), banquet.getTip(),
				banquet.getBeverage());

		double tax = banquet.calculateTax(baseCost);

		double cessAmount = banquet.calculateCess(guestNo, baseCost);

		banquet.calculateTheTotalCost(baseCost, tax, cessAmount);

	}

}
