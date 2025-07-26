package CSES.IntroductoryProblems;

import java.util.Scanner;

public class NumberSpiral {
    public static int findNumberInInfiniteSpiral(int y, int x) {
        return 0;
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
