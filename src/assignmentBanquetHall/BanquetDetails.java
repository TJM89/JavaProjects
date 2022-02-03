package assignmentBanquetHall;

public class BanquetDetails {

	double bookingCost;
	double foodCost;
	double tip;
	double beverage;
	int guestNo;

	public double getBookingCost() {
		return bookingCost;
	}

	public void setBookingCost(double bookingCost) {
		this.bookingCost = bookingCost;
	}

	public double getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}

	public double getTip() {
		return tip;
	}

	public void setTip(double tip) {
		this.tip = tip;
	}

	public double getBeverage() {
		return beverage;
	}

	public void setBeverage(double beverage) {
		this.beverage = beverage;
	}

	public int getGuestNo() {
		return guestNo;
	}

	public void setGuestNo(int guestNo) {
		this.guestNo = guestNo;
	}

	public double calculateBaseCost(double baseCost, double foodCost, double tip, double beverage) {

		double baseBookingCost = baseCost + foodCost + tip + beverage;
		return baseBookingCost;

	}

	public double calculateTax(double baseCost) {

		double taxPercent = 7.5;
		double totalTax = baseCost * taxPercent / 100;
		return totalTax;
	}

	public double calculateCess(int guestNo, double baseCost) {
		double cessAmount = 0;
		if (guestNo <= 40) {
			cessAmount = baseCost * 0.04;
		} else if (guestNo > 40 && guestNo <= 80) {
			cessAmount = baseCost * 0.08;
		} else if (guestNo > 80 && guestNo < 150) {
			cessAmount = baseCost * 0.1;
		} else if (guestNo > 150) {
			cessAmount = baseCost * .125;
		}
		return cessAmount;

	}

	public void calculateTheTotalCost(double baseCost, double tax, double cessAmount) {
		double totalCost = baseCost + tax + cessAmount;
		System.out.println("You will be charged $ " + tax + " extra for tax and $ " + cessAmount + " extra for Cess.");
		System.out
				.println("The total cost for booking the Banquet hall including Tax and Cess charges is $" + totalCost);
	}

}
