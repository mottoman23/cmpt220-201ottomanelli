package lab5;

import java.util.Scanner;

public class Problem7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10]; // Make array w length 10

		// Prompt to enter 10 numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();

		// Get distinct numbers
		int[] distinctNumbers = eliminateDuplicates(numbers);

		// Display result
		System.out.print("The distinct numbers are:");
		for (int e: distinctNumbers) {
			if (e > 0)
				System.out.print(" " + e);
		}
		System.out.println();
	}

	public static int[] eliminateDuplicates(int[] list) {
			int[] distinctNums = new int[list.length];
		int i = 0;
		for (int e: list) {
			if (linearSearch(distinctNums, e) == -1) {
				distinctNums[i] = e;
				i++;
			}
		}
		return distinctNums;
	}

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}
}