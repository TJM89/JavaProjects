package bankingApplicationAssignment;

public class Person {
	private String accountNumber;
	private String name;
	private double totalFundAvail;
	private String accountType;
	private String currentPin;

	String getCurrentPin() {
		return currentPin;
	}

	void setCurrentPin(String currentPin) {
		this.currentPin = currentPin;
	}

	Person(String accountNo, String name, double balance, String accountType) {
		this.accountNumber = accountNo;
		this.name = name;
		this.totalFundAvail = balance;
		this.accountType = accountType;

	}

	String getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalFundAvail() {
		return totalFundAvail;
	}

	public void setTotalFundAvail(double totalFundAvail) {
		this.totalFundAvail = totalFundAvail;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
