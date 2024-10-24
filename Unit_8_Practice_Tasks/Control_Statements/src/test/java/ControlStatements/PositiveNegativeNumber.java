package ControlStatements;

import java.util.Scanner;

public class PositiveNegativeNumber {

    ////   positive or negative number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int input = in.nextInt();
        if (input > 0) {
            System.out.println("Number is Positive");
        } else if (input < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }
}
