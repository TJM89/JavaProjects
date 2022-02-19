package bankingApplicationAssignment;

public class Atm extends BankingRules implements StandardProcess {

	public Boolean validatePin(String pin) {
		if (pin.equals("1989")) {
			return true;
		} else
			return false;
	}

	@Override
	public double deposit(double depositAmount, double balance) {
		System.out.println("**Deposit in progress, please wait**");

		balance = balance + depositAmount;
		System.out.println("\nYour Money has been successfully deposited\n");
		System.out.println("\nBalance Amount in your Account is $ " + balance);
		return balance;
	}

	@Override
	public double withdraw(double withdrawAmount, double balance) {
		System.out.println("**Transaction in progress, please wait**");

		if (balance >= withdrawAmount) {
			balance = balance - withdrawAmount;
			System.out.println("\nPlease collect your cash and collect the card\n");
			System.out.println("\nBalance Amount in your Account is $ " + balance);
		} else {
			System.out.println("\nSorry! Insufficient Funds in your Account");
			System.out.println();
		}
		return balance;
	}

	@Override
	void userIdentification() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Investment(String plan, double balance) {
		// TODO Auto-generated method stub

	}

	@Override
	public double fundTransfer(double amount, double balance, long accountNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
