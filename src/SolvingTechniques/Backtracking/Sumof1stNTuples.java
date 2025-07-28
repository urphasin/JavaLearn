package SolvingTechniques.Backtracking;

import java.util.*;

public class Sumof1stNTuples {
    public static int f(int i, int sum) {
        if (i < 1) return sum;
        sum += i;
        return f(i-1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an N to get sum of first N numbers: ");
        int n = sc.nextInt();

        System.out.println();

        f(n, 0);
        System.out.println(f(n,0));

        sc.close();
    }
}
