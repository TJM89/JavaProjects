package visaCardAssignment;

public class VisaCredit extends VisaParent {

	// Assuming $5000 credit card limit

	int creditLimit = 5000;
	private double billAmount;

	VisaCredit(double bill, String emailID, String cardNumber) {
		this.setCardNumber(cardNumber);
		this.billAmount = bill;
		this.setEmailID(emailID);

	}

	double getBillAmount() {
		return billAmount;
	}

	void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public boolean isCardValid() {
		if (this.cardValidation() && this.getCardNumber().equals("518145225181") && this.getPin() == 1989) {
			return true;
		}
		return false;

	}

	public void creditBalance(double billAmountMain) {

		if (billAmountMain <= creditLimit) {
			System.out.println("Validation success");
			System.out.println("All Visa card holders will get 5% discount at Walmart stores");
			System.out.println("All visa card purchases on electronics will have one year warranty under Visa scheme");
			System.out.println("");
			System.out.println("Payment processing...");
			System.out.println("Payment success! A payment confirmation email has been sent to your email address : "
					+ this.emailID);
			System.out.println("You have $ " + creditLimit + " limit on your credit card");
			System.out.println("The updated balance on your credit card is $ " + (creditLimit - billAmountMain));

		} else {
			System.out.println("Your total bill exceeds your credit limit!");
		}

	}

}