package bankingApplicationAssignment;

import java.util.Scanner;

public class BankingMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person = new Person("5236523689658965", "Thomas", 1500, "Chequing Account");
		int counter = 0;

		System.out.println("Enter the type of service you would like to perform?");
		System.out.println("1. ATM \n2. Online Banking");
		int selectionType = sc.nextInt();
		if (selectionType == 1) {
			boolean validPin = false;
			int opt = 1;
			Atm atm = new Atm();
			while (!validPin) {
				System.out.print("\nEnter the pin : ");
				String pin = sc.next();
				validPin = atm.validatePin(pin);
				if (validPin) {
					while (opt == 1) {
						System.out.println("\n\nSelect the function you would like to perform:");
						System.out.println("1. Withdraw");
						System.out.println("2. Deposit");
						System.out.println("3. Check Balance");
						System.out.println("4. Pin Change");

						int option = sc.nextInt();
						switch (option) {
						case 1: {
							System.out.print("Enter the amount to withdraw :");
							double balance = atm.withdraw(sc.nextDouble(), person.getTotalFundAvail());
							person.setTotalFundAvail(balance);
							break;
						}
						case 2: {
							System.out.print("Enter the amount to deposit :");
							double balance = atm.deposit(sc.nextDouble(), person.getTotalFundAvail());
							person.setTotalFundAvail(balance);
							break;
						}
						case 3: {
							System.out.println("Balance Amount in your Account is : $ " + person.getTotalFundAvail());
							break;
						}
						case 4: {
							System.out.println("Enter the new pin : ");
							person.setCurrentPin(sc.next());
							atm.pinChange();

							break;
						}
						default: {
							System.out.println("Invalid selection, please enter a valid option listed.");
							break;
						}

						}
						System.out.println(
								"\nDo you want to perform another transaction?\nPress 1 to continue \nPress 0 to Exit");
						opt = sc.nextInt();

					}
					break;
				}

				counter = counter + 1;
				if (counter >= 3) {
					System.out.println("Maxium attempts reached, Account Locked!");
					break;
				} else {
					System.out.print("Invalid Pin! try again ");
				}

			}
		} else if (selectionType == 2) {
			boolean validPin = false;
			boolean validUser = false;
			int opt = 1;
			OnlineBanking ob = new OnlineBanking();
			
			
			while (!validPin && !validUser) {
				System.out.print("Enter the User Name : ");
				String userName = sc.next();
				System.out.print("Enter the password : ");
				String password = sc.next();
				validPin = ob.validatePassword(password, userName);
				validUser = ob.validatePassword(password, userName);
				if (validPin && validUser) {
					while (opt == 1) {
						System.out.println("\n**Welcome to your online banking " + userName + "**");
						System.out.println("Please choose from one of the following options :");
						System.out.println("1. Fund Transfer");
						System.out.println("2. Investment");
						System.out.println("3. Check Balance");
						
						System.out.print("Choose the operation you would like to perform :");
						int option = sc.nextInt();
						switch (option) {
						case 1: {
							System.out.print("Enter the account number to transfer the amount :");
							long accountNo = sc.nextLong();
							System.out.print("Enter the amount to transfer :");
							double balance = ob.fundTransfer(sc.nextDouble(), person.getTotalFundAvail(), accountNo);
							person.setTotalFundAvail(balance);
							break;
						}
						case 2: {

							System.out.println("Please select your investment option:\n ");
							System.out.println("RRSP\nTFSA\nBonds\n");
							ob.Investment(sc.next(), option);

							break;
						}
						case 3: {
							System.out.println("Balance Amount in your Account is : $ " + person.getTotalFundAvail());
							break;
						}
						default: {
							System.out.println("Invalid selection, please enter a valid option listed.");
							break;
						}
						}
						System.out.println(
								"\nDo you want to perform another transaction?\nPress 1 to continue \nPress 0 to Exit");
						opt = sc.nextInt();
					}
					break;
				}
				System.out.print("Invalid Credentials! ");
				counter = counter + 1;
				if (counter >= 3) {
					System.out.println("Maxium attempts reached, Account Locked!");
					break;
				}

			}
		}

	}

}
