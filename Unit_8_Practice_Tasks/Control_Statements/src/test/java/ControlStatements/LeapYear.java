package ControlStatements;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner y = new Scanner(System.in);
        System.out.println("Please input the year: ");
        int year = y.nextInt();

        if (year <= 0) {
            System.out.println("Enter a Valid year");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("This year %d is a leap Year %n", year);
        } else {
            System.out.println("It is not a leap year");
        }

    }
}