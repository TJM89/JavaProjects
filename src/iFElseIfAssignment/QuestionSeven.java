package iFElseIfAssignment;

public class QuestionSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int height = 199;

		if (height <= 90)
			System.out.println("You cannot enter the ride, you're short.");
		else if (height >= 200)
			System.out.println("You can't use the ride!, you're tall!");
		else if (height <= 200)
			System.out.println("Congratulations! You can use this ride!");

	}
}
