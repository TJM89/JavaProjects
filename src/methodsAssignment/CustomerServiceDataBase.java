package methodsAssignment;

import java.util.Scanner;

public class CustomerServiceDataBase {

	public static void main(String[] args) {
		CustomerInformation updateNameobj = new CustomerInformation();
		CustomerInformation emailobj = new CustomerInformation();
		CustomerInformation addressobj = new CustomerInformation();

		String firstName = "";
		firstName = updateNameobj.getupdateName();
		System.out.println("The customer name is - " + firstName);

		String email = "";
		email = emailobj.getemail();
		System.out.println("The customer email id is - " + email);

		String addressNow = "";
		addressNow = addressobj.getaddress();
		System.out.println("The customer address is - " + addressNow);

		Scanner sc = new Scanner(System.in);

		firstName = "";
		System.out.println("Enter name of customer to be updated : ");
		updateNameobj.setfirstName(sc.next());
		firstName = updateNameobj.getupdateName();
		System.out.println("Updated first name of customer to - " + firstName);

		email = "";
		System.out.println("Enter email ID of customer to be updated : ");
		emailobj.setemail(sc.next());
		email = emailobj.getemail();
		System.out.println("Updated email of customer to - " + email);

		addressNow = "";
		System.out.println("Enter the new address for the customer : ");
		addressobj.setaddress(sc.next());
		addressNow = addressobj.getaddress();
		System.out.println("Updated the address of " + firstName + " to - " + addressNow);

	}

}
