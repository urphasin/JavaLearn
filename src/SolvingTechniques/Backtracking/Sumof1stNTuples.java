package SolvingTechniques.Backtracking;

import java.util.*;

public class Sumof1stNTuples {
    public static long f(int i) {
        if (i < 1) return 0;
        return i + f(i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an N to get sum of first N numbers: ");
        int n = sc.nextInt();

        System.out.println("GO!"); // Space between input and output

        long start = System.currentTimeMillis();

        // Expensive function
        long ans = f(n);

        long end = System.currentTimeMillis();

        System.out.println("Result = " + ans);
        System.out.println("Time Taken = " + (end - start) + "ms");

        sc.close();
    }
}
