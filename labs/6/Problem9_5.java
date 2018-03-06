package lab6;

import java.util.GregorianCalendar;

public class Problem9_5 {
	public static void main(String[] args) {
		// Create GregorianCalendar object
		GregorianCalendar calendar = new GregorianCalendar();

		// Display current year, month, & day
		System.out.print("\nCurrent year, month, and day in format Mth/Day/Year: ");
		System.out.println(calendar.get(calendar.MONTH) + "/" +
			calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR));

		// Set elapsed time since January 1, 1970 to 1234567898765L
		calendar.setTimeInMillis(1234567898765L);

		// Display year, month & day
		System.out.print("\nTime passed since January 1, 1970 set to " +
			"1234567898765L (in format Mth/Day/Year): ");
		System.out.println(calendar.get(calendar.MONTH) + "/" +
			calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR));
	}
}