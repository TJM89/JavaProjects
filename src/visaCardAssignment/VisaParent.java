package visaCardAssignment;

public class VisaParent {
	String emailID = "james@gmail.com";
	String cardNumber;
	String pin;

	String getPin() {
		return pin;
	}

	void setPin(String pin) {
		this.pin = pin;
	}

	String getCardNumber() {
		return cardNumber;
	}

	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	String getEmailID() {
		return emailID;
	}

	void setEmailID(String emailID) {
		this.emailID = emailID;

	}

	public boolean cardValidation() {
		if (this.getCardNumber().length() == 12)
			return true;
		return false;

	}

	public double visaDiscount(double billAmount) {
		double discountAmount = billAmount - (billAmount * 0.05);
		return discountAmount;

	}

}
