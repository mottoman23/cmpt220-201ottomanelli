package lab5;

import java.util.Scanner;

public class Problem8_11 {
	public static void main(String[] args) {

        int[][] m = new int[3][3];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int num = input.nextInt();
        String binary = decimalToBinaryModified(num);

        int bIndex = 0;
        for (int i = 0; i < m.length; i++) {

            for (int k = 0; k < m[i].length; k++) {
                int coinSide = (binary.charAt(bIndex++) == '0') ? 0 : 1;
                m[i][k] = coinSide;
            }
        }
        for (int i = 0; i < m.length; i++) {

            for (int k = 0; k < m[i].length; k++) {
                char ch = (m[i][k] == 0) ? 'H' : 'T';
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }

    public static String decimalToBinaryModified(int num) {

        StringBuilder s = new StringBuilder();
        while (num != 0) {
            s.append(num & 1);
            num = num >> 1;
        }
        while (s.length() < 9) {
            s.insert(0, "0");
        }
        return s.toString();
    }
}