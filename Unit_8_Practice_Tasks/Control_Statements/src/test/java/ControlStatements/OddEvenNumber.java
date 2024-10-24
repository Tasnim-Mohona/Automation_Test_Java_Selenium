package ControlStatements;

import java.util.Scanner;

public class OddEvenNumber {

    // Odd or Even
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int input = in.nextInt();

        if (input % 2 == 0 && input != 0) {
            System.out.println("Number is Even");
        } else if (input % 2 != 0) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Zero");
        }
    }
}
