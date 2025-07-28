package SolvingTechniques.Backtracking;

import java.util.*;

public class Nto1 {
    public static void f(int i, int N) {
        if (i > N) return;
        f(i+1, N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Value of N to print N -> 1: ");
        int n = sc.nextInt();
        f(1, n);
        sc.close();
    }
}
