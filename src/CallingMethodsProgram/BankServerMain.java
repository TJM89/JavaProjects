package CallingMethodsProgram;

import java.util.Scanner;

public class BankServerMain {

	public static void main(String[] args) {
		BankOperation obj = new BankOperation();
		String accountName = "Thomas";
		String cardNumber = "5211521152115211";
		int pinNumber = 1989;
		double accountBalance = 0;

		double depositMoney = obj.depositMoney(accountBalance, accountBalance);

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input pin number :");
		pinNumber = sc.nextInt();

		if (cardNumber.equals("5211521152115211") && pinNumber == 1989) {

			System.out.println("Login Success, Welcome : " + accountName);

			System.out.println("Please enter the amount you wish to deposit :");
			depositMoney = sc.nextInt();
			System.out.println(
					"Money deposited successfully. " + "New a/c balance is $" + (accountBalance + depositMoney));

		} else {
			System.out.println("Wrong information, try again");

		}

	}
}
