package visaCardAssignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * I'm taking into assumption the bill payment stage at Walmart online checkout
		 * The amounts have been hard coded since the input constraints are verifying
		 * the card type used for payment an the pin validation of those cards. Debit
		 * card validation checks the pin number, card number and displays the bank
		 * account balance during sys out and Credit card validation checks the pin
		 * number,card number and displays the credit card balance during sys out
		 * 
		 */

		String cardOne = "Debit";
		String cardTwo = "Credit";
		int num1 = 100;
		int num2 = 100;
		int num3 = 1000;
		int num4 = 3000;
		int sum = (num1 + num2 + num3 + num4);

		System.out.println("***Welcome to Walmart online self checkout service***");
		System.out.println("");
		System.out.println("You can pay using Visa Debit or Visa Credit card");
		System.out.println("");
		System.out.println("Your Shopping Cart");
		System.out.println("_________________________________");
		System.out.println("RCA 60 inch 4K Ultra HD Smart TV powered by webos");
		System.out.println("Quantity - 1");
		System.out.println("Price - $ " + num1);
		System.out.println("Carter's Newborn Boy Take Me Home sleeping dress set");
		System.out.println("Quantity - 5");
		System.out.println("Price - $ " + num2);
		System.out.println("Car battery with charging cable");
		System.out.println("Quantity - 1");
		System.out.println("Price - $ " + num3);
		System.out.println("Apple AirPods with charging case");
		System.out.println("Quantity - 5");
		System.out.println("Price - $ " + num4);
		System.out.println("_________________________________");
		System.out.println("Estimated Total is $ " + (sum));
		System.out.println("_________________________________");
		System.out.println("");
		System.out.println("Type in Debit for Visa Debit OR Credit for Visa Credit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the payment method :");
		String card = sc.next();

		// Debit card
		if (card.equals(cardOne)) {
			VisaDebit visaDebit = new VisaDebit(sum, "james@gmail.com", "418188559966");
			System.out.println("You have selected Visa Debit");
			System.out.println("Please enter the pin number to proceed : ");
			visaDebit.setPin(sc.next());

			if (visaDebit.isCardValid()) {
				System.out.println("**Visa Debit card holders get additional 1% discount on the total bill amount**");
				double discountedAmount = visaDebit.specialDebitDiscount();
				visaDebit.dCardBalance(discountedAmount);
			}

			else {
				System.out.println("Invalid information, try again!");
			}
		}

		// Credit card
		else if (card.endsWith(cardTwo)) {
			VisaCredit visaCredit = new VisaCredit(sum, "james@gmail.com", "518145225181");
			System.out.println("You have selected Visa Credit");
			System.out.println("Please enter the pin number to proceed: ");
			visaCredit.setPin(sc.next());

			if (visaCredit.isCardValid()) {
				double discountedAmount = visaCredit.visaDiscount(sum);
				visaCredit.creditBalance(discountedAmount);

			} else {
				System.out.println("Invalid information, try again!");
			}

		} else {
			System.out.println("Invalid entry, please type 'Debit' or 'Credit' to proceed. Try again.");

		}
	}

}
