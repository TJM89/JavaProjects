package bankingApplicationAssignment;

public interface StandardProcess {

	public double deposit(double depositAmount, double balance);

	public double withdraw(double amount, double balance);

	public double fundTransfer(double amount, double balance, long accountNo);

	public void Investment(String plan);
}
