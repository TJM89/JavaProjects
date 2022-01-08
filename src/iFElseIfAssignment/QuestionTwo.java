package iFElseIfAssignment;

public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		int level = 0;
		String otherStatus = "Invalid status";

		if (age >= 16) {
			if (level == 0) {
				System.out.println("You have G1 license issued");
			} else if (level == 1) {
				System.out.println("You have G2 license issued");
			} else if (level == 2) {
				System.out.println("You have G license issued");
			} else
				System.out.println(otherStatus);

		}
	}

}