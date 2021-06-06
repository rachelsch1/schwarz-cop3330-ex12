package ex12.base;

/* Computing simple interest is a great way to quickly figure out whether an investment has value. It’s also a good way to get comfortable with explicitly coding the order of operations in your programs.

Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage, and the time, and display the amount accrued (principal + interest).

The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual rate of interest, t is the number of years the amount is invested, and A is the amount at the end of the investment.

Example Output
Enter the principal: 1500
Enter the rate of interest: 4.3
Enter the number of years: 4
After 4 years at 4.3%, the investment will be worth $1758.
Constraints
Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.
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
