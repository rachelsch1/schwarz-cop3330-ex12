package ex12.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String str1 = input.nextLine();
        int principal = Integer.parseInt(str1);

        System.out.print("Enter the rate of interest: ");
        String str2 = input.nextLine();
        double rate = Double.parseDouble(str2);
        double ratePercent = rate / 100;

        System.out.print("Enter the number of years: ");
        String str3 = input.nextLine();
        int years = Integer.parseInt(str3);

        double interest = principal * (1 + (ratePercent * years));

        String outputString = "After " + years + " years at " + rate + "%, the investment will be worth ";

        System.out.print("After " + years + " years at " + rate + "%, the investment will be worth ");
        System.out.format("$%.2f.%n", interest);

    }
}
