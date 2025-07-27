//package CSES.IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class NumberSpiral {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void findNumberInInfiniteSpiral(long y, long x) throws IOException {
        long n = Math.max(y, x);
        long start =  (n - 1) * (n - 1) + 1;
        long res = 0;
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
                res = start + (n - 1) + (n - y);
            }
            else if (y > x) {
                res = start + (x - 1);
            }
            else {
                res = start + (n - 1);
            }
        }
        bw.write(res + "\n");
    }

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long y = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            findNumberInInfiniteSpiral(y, x);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
