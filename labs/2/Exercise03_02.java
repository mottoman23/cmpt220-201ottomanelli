package lab2;

import java.util.Scanner;

public class Exercise03_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get three random integers 
		int digit1 = (int)(Math.random() * 10);
		int digit2 = (int)(Math.random() * 10);
		int digit3 = (int)(Math.random() * 10);

		// Prompt user to enter sum of integers
		System.out.print(
			"What is " + digit1 + " + " + digit2 + " + " + digit3 + "? ");
		int answer = input.nextInt();
		
		System.out.println(
			digit1 + " + " + digit2 + " + " + digit3 + " = " + answer + " is " +
			(digit1 + digit2 + digit3 == answer));
	}
}
