package bankingApplicationAssignment;

public class OnlineBanking extends BankingRules implements StandardProcess {

	public Boolean validatePassword(String password) {
		if (password.equals("unlockme")) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean userIdentification(String userName) {
		if (userName.equals("Thomas")) {
			return true;
		} else
			return false;

	}

	@Override
	public double deposit(double depositAmount, double balance) {
		return balance;

	}

	@Override
	public double withdraw(double withdrawAmount, double balance) {
		System.out.println("Withdrawing Amount : $ " + withdrawAmount);
		if (balance >= withdrawAmount) {
			balance = balance - withdrawAmount;
			System.out.println("$" + withdrawAmount + " has been successfully withdrawn from your account ");
			System.out.println("Balance Amount in your Account is $ " + balance);
		} else {
			System.out.println("\nSorry! Insufficient Funds");
			System.out.println();
		}
		return balance;
	}

	@Override
	public double fundTransfer(double transferAmount, double balance, long accountNo) {
		if (balance >= transferAmount) {
			balance = balance - transferAmount;
			System.out.println(
					"$" + transferAmount + " has been successfully transfered to account number " + accountNo + "\n");
			System.out.println("Updated balance Amount in your Account is $ " + balance);
		} else {
			System.out.println("Sorry! Insufficient Funds");
			System.out.println();
		}
		return balance;

	}

	@Override
	public void Investment(String plan, double balance) {
		System.out.println("Your selected investment option is " + plan);
		System.out.println("You have $" + balance + " in your account for making an Investment ");
		System.out.println("Please call our Financial Advisor on +1 888-915-5660 for further details");

	}

}
