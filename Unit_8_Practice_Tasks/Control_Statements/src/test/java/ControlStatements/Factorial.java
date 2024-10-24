package ControlStatements;

public class Factorial {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else
            return (n * factorial(n - 1));
    }

        public static void main(String[]args){
            int num, i, fact;
            fact = 1;
            num = 5;

            for (i = 1; i <= num; i++) {
                fact = fact * i;
            }
            //  System.out.printf("Factorial of %d %d%n", num,fact);
            System.out.println(String.format("Factorial of %d %d", num, fact));
        }


    }
