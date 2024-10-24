package ControlStatements;

import java.util.Scanner;

public class VoterValidity {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = in.nextInt();

        if (age <= 0 ) {
            System.out.println("Enter a valid age.");
        } else if (age < 18) {
            System.out.println("Not yet a Voter");
        }
        else {System.out.println("A valid voter");}
    }
}
