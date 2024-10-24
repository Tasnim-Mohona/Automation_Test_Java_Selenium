package ControlStatements;

public class ErrorsAndException {

        public static void main(String[] args) {
            try {
                checkNumber(-1);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            } finally {
                System.out.println("Execution completed.");
            }
        }

        public static void checkNumber(int number) {
            if (number < 0) {
                throw new IllegalArgumentException("Number must be positive");
            }


            // 1. Handling NullPointerException:
            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println("Caught a NullPointerException");
            }

            // Handling ArrayIndexOutOfBoundsException:
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught an ArrayIndexOutOfBoundsException");
            }
            // Handling ArithmeticException:
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Caught an ArithmeticException: " + e.getMessage());
            }

            // ERROR : StackOverflowError
//            public static void recursiveMethod () {
//                recursiveMethod(); // Infinite recursion
//            }
//
//            public static void main (String[]args){
//                try {
//                    recursiveMethod();
//                } catch (StackOverflowError e) {
//                    System.out.println("Caught a StackOverflowError");
//                }

            }
        }
