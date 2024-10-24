package ControlStatements;

public class FibonacciUsingWhileLoop {
    public static void main(String[] args) {
        int n = 10;
        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;

        int i = 2;
        while (i < n) {
            fib[i] = fib[i - 1] + fib[i - 2];
            i++;
        }

        System.out.println(" Fibonacci Series using While loop:");
        for (int j = 0; j < n; j++) {
            System.out.println(fib[j] + "");
        }

    }
}
