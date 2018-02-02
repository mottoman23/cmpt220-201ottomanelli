package lab1;

import java.util.Scanner;

public class Exercise02_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a degree
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();

		// Convert celsius to fahrenheit
		double fahrenheit = 9.0 / 5 * celsius + 32;

		// Display results
		System.out.println(celsius + " degrees Celsius is " + fahrenheit
			+ " degrees Fahrenheit"); 
	}
}

