package iFElseIfAssignment;

public class JanNineQuestionTwoWaterTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bucketsFilled = 10;

		for (int counter = 1; counter <= 10; counter++) {
			int tankCapacity = bucketsFilled * counter;

			System.out.println("Tank has filled up " + (tankCapacity) + " litres");
		}
		if (bucketsFilled >= 100);
			

		System.out.println("Maximum tank capacity reached! Cannot overfill");

	}

}
