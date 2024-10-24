package ControlStatements;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args){
        int  sum = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("Input bound of Natural Numbers: ");
        int n = num.nextInt();
        System.out.println ("The Natural numbers up to "+n+" terms: \n");
        for (int i =1; i<=n; i++)
        {
            System.out.println(i);
            sum += i;
        }
        System.out.println("\n The sum of natural numbers upto "+n+" terms : " + sum);
    }
}
