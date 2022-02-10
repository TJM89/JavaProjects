package visaCardAssignment;

public class VisaDebit extends VisaParent {

	// Assuming $4000 is the bank balance

	int debitCardBalance = 4000;

	private double billAmount;

	VisaDebit(double bill, String emailID, String cardNumber) {
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
		if (this.cardValidation() && this.getCardNumber().equals("418188559966") && this.getPin().equals("2022")) {
			return true;
		}
		return false;
	}

	public double specialDebitDiscount() {
		double specialDebitDiscount = this.visaDiscount(this.getBillAmount()) + (this.getBillAmount() * 0.01);
		return specialDebitDiscount;

	}

	public void dCardBalance(double billAmountMain) {
		if (billAmountMain <= debitCardBalance) {
			System.out.println("Validation success");
			System.out.println("All Visa card holders will get 5% discount at Walmart stores");
			System.out.println("All visa card purchases on electronics will have one year warranty under Visa scheme");
			System.out.println("");
			System.out.println("Payment processing...");
			System.out.println("Payment success! A payment confirmation email has been sent to your email address : "
					+ this.emailID);
			System.out.println("You had $ " + debitCardBalance + " on your debit card");
			System.out.println("The new balance amount on your debit card is $ " + (debitCardBalance - billAmountMain));

		} else {
			System.out.println("Your total bill exceeds your account balance!");
		}
	}

}
