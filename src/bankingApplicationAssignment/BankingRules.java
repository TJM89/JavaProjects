package bankingApplicationAssignment;

public abstract class BankingRules {

	abstract void userIdentification();

	public int noOfTransactionAllowed() {
		return 5;
	}

	public double dailyWithdrawalLimit() {
		return 1000;
	}

	public void pinChange() {
		System.out.println("Your pin has been updated");

	}

}
