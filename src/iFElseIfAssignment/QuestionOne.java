package iFElseIfAssignment;

public class QuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mark = 75.1;
		if (mark <= 50) {
			System.out.println("Your grade is D, need improvement");
		} else if (mark <= 60)
			System.out.println("Your Grade is C, satisfactory");
		else if (mark <= 75)
			System.out.println("Your Grade is B, Good job.");
		else if (mark >= 75)
			System.out.println("Your Grade is A, Excellent work!");
	}
}
