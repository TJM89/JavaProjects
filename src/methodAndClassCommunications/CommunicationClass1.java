package methodAndClassCommunications;

public class CommunicationClass1 {

	String name = "Thomas";
	
	int num1 = 80;
	int num2 = 30;
	

	void myNameCombined() {		
		
		System.out.println("My name is " + name);
		System.out.println("I can add 2 numbers and the result is " + (num1 + num2));
		System.out.println("I can substract two numbers " + (num1-num2));
		System.out.println("I can multiply two numbers " + (num1*num2));
		
	}
}
