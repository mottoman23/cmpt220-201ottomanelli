package lab1;

import java.util.Scanner;

public class Exercise02_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the starting velocity, ending velocity and time
		System.out.print("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();

		// Calculate the average acceleration
		double a = (v1 - v0) / t;

		// Display result
		System.out.println("The average acceleration is " + a);
	}
}
