/*
 * An online bank wants you to create a program that shows prospective
customers how their deposits will grow. Your program should read the
initial balance and the annual interest rate. Interest is compounded
monthly. Print out the balances after the first three months.
Here is a sample run:
Initial balance: 1000
Annual interest rate in percent: 6.0
After first month: 1005.00
After second month: 1010.03
After third month: 1015.08
 */

import java.util.Scanner;

public class Exercise22 {
    double initialBalance;
    float interest;

    Exercise22(double balance, float interest){
        this.initialBalance = balance;
        this.interest = interest;
    }
    
    public double getInterest(int month){
        // CI = P(1 + (r/12) )^12t - P
        float interest = this.interest / 100;
        double cinterest = initialBalance * Math.pow((1 + interest/12), month) - initialBalance;
        return cinterest;
    }
    public static void main(String[] args) {
        double initialBalance;
        float interest;

        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the initial balance (i.e. principle amount): ");
        initialBalance = scn.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        interest = scn.nextFloat();
        scn.close();

        Exercise22 ex = new Exercise22(initialBalance, interest);

        double firstMonthBalance = ex.getInterest(1) + initialBalance;
        double secondMonthBalance = ex.getInterest(2) + initialBalance;
        double thirdMonthBalance = ex.getInterest(3) + initialBalance;

        System.out.printf("Balance after first month:  %.2f\n", firstMonthBalance);
        System.out.printf("Balance after second month: %.2f\n",  secondMonthBalance);
        System.out.printf("Balance after third month:  %.2f\n", thirdMonthBalance);
    }
}
