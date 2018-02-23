package project1;

import java.util.*;

public class paperProblem {

  static Scanner a1 = new Scanner(System.in);

  public static void main(String[] args) {

    int n = a1.nextInt();
    int[] nSheets = new int[n];
    for (int i = 1; i < n; i++)
      nSheets[i] = a1.nextInt();

    double[] tape = new double[n];
    for (int i = 1; i < n; i++)
      tape[i] = Math.pow(2, ((double)(-1 - i * 2)) / 4.0);

    double tapeUsed = 0;
    int nNextSizeNeeded = 1;
    for (int i = 0; i < n; i++) {

      tapeUsed += tape[i] * ((double)(nNextSizeNeeded / 2));

      if (nSheets[i] >= nNextSizeNeeded) {
        nNextSizeNeeded = 0;
        break;
      
      } else
        nNextSizeNeeded = (nNextSizeNeeded - nSheets[i]) * 2;

    }

    if (nNextSizeNeeded > 0)
      System.out.println("impossible");
    else
      System.out.println(tapeUsed);
  }

}