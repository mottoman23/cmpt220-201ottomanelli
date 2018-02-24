package lab5;

import java.util.Scanner;

public class Problem7_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list: ");
		int[] list = new int[input.nextInt()];
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();

		// Display whether list is sorted or not.
		System.out.println(
			"The list is " + (sorted(list) ? "already " : "not ") + "sorted");
	}

	public static boolean sorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}
}