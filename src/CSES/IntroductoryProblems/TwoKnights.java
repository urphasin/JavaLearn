//package CSES.IntroductoryProblems;

import java.util.Scanner;

public class TwoKnights {
    public static void permutate(int n) {
        long total = (((long) n * n) * (((long) n * n) - 1)) / 2;
        if (n <= 2) {
            System.out.println(total);
        }
        else {
            long prev = 0;
            long curr = 0;
            for (int i = 3; i <= n; i++) {
                prev = (i - 2) * 8L;
                curr += prev;
            }
            System.out.println(total - curr);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        long start = System.currentTimeMillis();

        for (int i = 1; i <= n; i++)
        {
            permutate(i);
        }

        long end = System.currentTimeMillis();
//        System.out.println("Time taken = " + (end - start) + "ms");


    }
}
