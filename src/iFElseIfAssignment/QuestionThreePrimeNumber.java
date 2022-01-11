package iFElseIfAssignment;

import java.util.Scanner;

public class QuestionThreePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long numberUsed = 0l;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the number below:");
		numberUsed = sc.nextLong();

		if (numberUsed % 2 > 0 
				&& numberUsed % 3 >= 0 
				&& numberUsed % numberUsed == 0 
				&& numberUsed % 5 >= 0
				&& numberUsed % 9 >= 0 
				&& numberUsed % 11 >= 0) {
			
			System.out.println(numberUsed + " is a Prime number");
		}
			else if
				(numberUsed*1 ==2)
		{
			System.out.println("*2 is a classic prime number*");
		}
					 else {
			System.out.println(numberUsed + " is Not a prime number");
		}

	}

}
