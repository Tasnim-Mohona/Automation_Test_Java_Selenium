package ControlStatements;

import java.util.Scanner;

public class CheckNumber {
    public  static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = in.nextInt();


        if(num < 0){
            System.out.println("The number is negative");
        } else if (num == 0) {
            System.out.println(" Zero doesn't have a state");
        }
        else{System.out.println("The number is positive");
        }
    }
}
