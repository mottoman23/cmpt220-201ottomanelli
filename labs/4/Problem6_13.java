package lab4;

public class Problem6_13 {
	public static void main(String[] args) {
		// Display table between 1.0 and 20.0
		double seriesStart  =  1.0;
		double numberOfRows = 20.0;

		// Display header
		System.out.println("i         m(i)     ");
		System.out.println("-------------------");

		// Display data
		for (double i = seriesStart; i <= numberOfRows; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", sumSeries(i));
		}
	}

	/*** Method sumSeries: computes the series */
	public static double sumSeries(double n) {
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += i / (i + 1);
		}
		return sum;
	}
}