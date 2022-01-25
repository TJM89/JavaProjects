package methodAndClassCommunications;

public class ReturnValuesMain {

	public static void main(String[] args) {

		// creating an object to return the account number
		ReturnValues obj = new ReturnValues();
		double accountNumber = 0.0;
		double getAccountNumber = obj.getAccountnumber();
		System.out.println("Account Number is " + getAccountNumber);
		
		// new object created to update the account number
		
		double updatedAccountNumber = 0;
		{
			System.out.println("Updated account number is " + updatedAccountNumber );
		}
		
		
		

	}

}
