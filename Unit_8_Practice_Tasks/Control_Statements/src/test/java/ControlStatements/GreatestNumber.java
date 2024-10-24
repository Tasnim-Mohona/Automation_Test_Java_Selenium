package ControlStatements;

import java.util.Scanner;

public class GreatestNumber {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st Number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd Number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd Number: ");
        int num3 = in.nextInt();

        if (num1 > num2)
            if (num1 > num3)
                System.out.print("The Greatest number: " + num1);


        if (num2 > num1 && num2 > num3)
            System.out.print("The greatest number: " + num2);

        if (num3 > num1 && num3 > num2)
            System.out.print("The greatest number: " + num3);
    }
}
