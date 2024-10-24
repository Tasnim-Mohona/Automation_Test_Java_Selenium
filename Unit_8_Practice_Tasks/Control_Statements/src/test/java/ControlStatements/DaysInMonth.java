package ControlStatements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Days = 0;
        String NameOfMonth = "Unknown";

        System.out.println("Input a month number: ");
        int month = input.nextInt();

        System.out.println("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                NameOfMonth = "January";
                Days = 31;
                break;
            case 2:
                NameOfMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    Days = 29;
                } else {
                    Days = 28;
                }
                break;

            case 3:
                NameOfMonth = "April";
                Days = 30;
                break;
            case 4:
                NameOfMonth = "May";
                Days = 31;
                break;
            case 5:
                NameOfMonth = "June";
                Days = 31;
                break;
            case 6:
                NameOfMonth = "June";
                Days = 30;
                break;
            case 7:
                NameOfMonth = "July";
                Days = 31;
                break;
            case 8:
                NameOfMonth = "August";
                Days = 31;
                break;
            case 9:
                NameOfMonth = "September";
                Days = 30;
                break;
            case 10:
                NameOfMonth = "October";
                Days = 31;
                break;
            case 11:
                NameOfMonth = "November";
                Days = 30;
                break;
            case 12:
                NameOfMonth = "December";
                Days = 31;
                break;
        }
        System.out.print("Days in" + " " + NameOfMonth  + " in" + year + " has " + Days );
        System.out.printf ("Days in %s in %d has %d%n", NameOfMonth, year, Days);
        String formattedString = String.format("Days in %s in %d has %d", NameOfMonth, year, Days);
        System.out.print(formattedString);
    }
}
