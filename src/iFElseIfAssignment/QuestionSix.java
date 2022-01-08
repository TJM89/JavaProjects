package iFElseIfAssignment;

public class QuestionSix {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
	double normalPrice = 3000;
	String promoCode = "Promo20";
	double defaultRate = normalPrice * 0.5;
	
	if (promoCode==""){
	System.out.println(defaultRate);
	
	}else if (promoCode == "Promo5")
	System.out.println("Your discount is $" + defaultRate * 0.05);
	
	else if (promoCode == "Promo10")
	System.out.println("Your discount is $" + defaultRate * 0.1);
	
	else if (promoCode == "Promo20")
	System.out.println("Your discount is $" + defaultRate * 0.2);
	
	else System.out.println("Invalid entry");
}}