package methodsAssignment;

public class ProductDetails {

	String laptopName = "The laptop brand is HP";
	String laptopDescription = "12GB RAM, 1TB SSD and runs on Windows 11 OS";
	String laptopDescription2 = "Performance meets precision. Harness the power of the ENVY 15 Laptop with an Intel® Core™ processor plus stunning graphics";
	double laptopPrice = 900;

	void laptopName() {

		System.out.println(laptopName);
	}

	void laptopDescription() {

		System.out.println(laptopDescription);
	}

	void laptopDescription2() {

		System.out.println(laptopDescription2);

	}

	void laptopPrice() {

		System.out.println("The laptop price is $" + laptopPrice);
	}

}
