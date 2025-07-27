package CSES.IntroductoryProblems;

import java.util.Scanner;
import java.lang.Math;

public class NumberSpiral {
    public static int findNumberInInfiniteSpiral(int y, int x) {
        int n = Math.max(y, x);
        int start = (int)(Math.pow(n-1, 2) + 1);
        int res = 0;
        if (n % 2 == 0) {
            if (y < x)
            {
                res = start + (y - 1);
            }
            else if (y > x) {
                res = start + (n - 1) + (n - x);
            }
            else {
                res = start + (n - 1);
            }
        }
        else {
            if (y < x) {

            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(findNumberInInfiniteSpiral(y, x));
        }
    }
}
