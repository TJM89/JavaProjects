package gamingConsole;

public class GamingConsole {

	public static void main(String[] args) {

		GamingConsoleDatabase obj1 = new GamingConsoleDatabase("Sony PS5");
		System.out.println("My Gaming console's brand name is " + obj1.consoleBrand);

		GamingConsoleDatabase obj2 = new GamingConsoleDatabase(1);
		System.out.println("I have " + obj2.consoleAvailability + " console");

		GamingConsoleDatabase obj3 = new GamingConsoleDatabase(true);
		System.out.println("Is my gaming console turned on now? " + obj3.isConsoleOn);

	}

}
