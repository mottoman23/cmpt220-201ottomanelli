//package lab3;

import java.util.Scanner;

public class Problem5_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		int index = 2; // Numbers to test as factors 

		// Find and display smallest factors in increasing order
		while (number / index != 1) {
			if (number % index  == 0) {
				System.out.print(index + ", ");
				number /= index; 
			}
			else
				index++;
		}
		System.out.println(number + ".");
	}
}
