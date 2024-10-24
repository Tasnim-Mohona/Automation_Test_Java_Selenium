package ControlStatements;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the Number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            for (int spc = n - i; spc > 0; spc--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
