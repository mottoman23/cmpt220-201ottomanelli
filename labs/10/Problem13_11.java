//package lab10;

public class Problem13_11 {
	public static void main(String[] args) throws CloneNotSupportedException {
		// Create an Octagon object
		Octagon o1 = new Octagon(5);

		// Display area and perimeter of object
		System.out.println("\nOctagon:\nArea: " + o1.getArea() + 
			"\nPerimeter: " + o1.getPerimeter());

		// Create new object using the clone method
		System.out.println("Cloning Octagon...");
		Octagon o2 = (Octagon)o1.clone();

		// Compare the two object using compareTo method
		int result = (o1.compareTo(o2));
		if (result == 1)
			System.out.println("Octagon is greather than its clone.");
		else if (result == -1)
			System.out.println("Octagon is less than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");
	}
}