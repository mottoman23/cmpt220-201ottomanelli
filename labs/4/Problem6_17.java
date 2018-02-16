package lab4;

import java.util.Scanner;

public class Problem6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter n
		System.out.print("Enter n: ");
		int n = input.nextInt();

		// Display a n-by-n matrix
		printMatrix(n);
	}

	/** Method printMatrix displays an n-by-n matrix */
	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols ++) {
				// Randomly Generate 0 or 1
				System.out.print((int)(Math.random() * 2));
			}
			System.out.println();
		}
	}
}