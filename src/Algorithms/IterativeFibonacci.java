package Algorithms;

import java.math.BigInteger;

public class IterativeFibonacci {
    public static BigInteger fibonacci(int n)
    {
        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger prev = BigInteger.ZERO, curr = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
        {
            BigInteger next = prev.add(curr);
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci(1000000) -> " + fibonacci(1000000));
//        System.out.println("Fibonacci(400) -> " + fibonacci(400));
//        System.out.println("Fibonacci(399)  -> " + fibonacci(401).subtract(fibonacci(400)));
    }
}
