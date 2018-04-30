//package lab10;

public class Problem13_9 {
	public static void main(String[] args) {
		// Create three Circle objects
		Circle c1 = new Circle(5, "red", true);
		Circle c2 = new Circle(5, "green", false);
		Circle c3 = new Circle(4, "green", false);

		// Display results
		System.out.println("Circle 1's radius: " + c1.getRadius());
		System.out.println("Circle 2's radius: " + c2.getRadius());
		System.out.println("Circle 3's radius: " + c3.getRadius());

		System.out.println("Circle 1 is " + (c1.equals(c2) ? "" : "not ") +
			"equal to circle 2");

		System.out.println("Circle 1 is " + (c1.equals(c3) ? "" : "not ") +
			"equal to circle 3");
	}
}