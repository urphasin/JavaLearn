package July23;

import java.util.*;

public class A2126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int x = sc.nextInt();
            if (x <= 9) {
                System.out.println(x);
            }
            else {
                List<Integer> arr = new ArrayList<>();
                while (x != 0) {
                    int unit = x % 10;
                    arr.add(unit);
                    x = x / 10;
                }

                int min = Integer.MAX_VALUE;
                for (int num : arr) {
                    if (num < min) {
                        min = num;
                    }
                }
                System.out.println(min);
            }
        }
        sc.close();
    }
}
