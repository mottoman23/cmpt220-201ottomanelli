//package lab3;

public class Problem5_13 {
	public static void main(String[] args) {
		int n = 0;
		// Find the largest n such that n^3 is < 12,000
		while (Math.pow(n + 1, 3) < 12000) {
			n++;
		}
		// Display result
		System.out.println(
			"The largest integer of n such that n^3 is less than 12,000 is: " + n);
	}
}