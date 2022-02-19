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
		System.out.println("**Loading.... please wait**");

		balance = balance + depositAmount;
		System.out.println("\nYour Money has been successfully deposited\n");
		System.out.println("\nBalance Amount in your Account is $ " + balance);
		return balance;
	}

	@Override
	public double withdraw(double withdrawAmount, double balance) {
		System.out.println("**Loading.... please wait**");

		if (balance >= withdrawAmount && dailyWithdrawalLimit() >= withdrawAmount) {
			balance = balance - withdrawAmount;
			System.out.println("\nPlease collect your cash and collect the card\n");
			System.out.println("\nBalance Amount in your Account is $ " + balance);
		} else {
			System.out.println("\nUnable to process transaction. Please input an amount below your withdrawal limit");
			System.out.println();
		}
		return balance;
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

	@Override
	boolean userIdentification(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

}
