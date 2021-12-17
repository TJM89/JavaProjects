
public class TheRectangle {

	public static void main(String[] args) {
		System.out.println("Calculating the perimeter and area of a rectangle:");
		int length = 14;
		int breadth = 6;
		int perimeter = (length + breadth) + (length + breadth);
		System.out.println("The perimeter of the rectangle is P = 2(length+breadth) = " + perimeter);
		int area = length * breadth;
		System.out.println("The area of the rectangle is Area = length X breadth = " + area);

	}

}
