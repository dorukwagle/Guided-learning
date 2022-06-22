/*
 * Write a program that prints the balance of an account
 * after the first, second, and third year. 
 * The account has an initial balance of £1,000 and earns 5 percent interest per year.
 */

public class BalanceOfAnAccount{
    public static void main(String[] args) {
        // store initial amount as principle amount
        int principle = 1000;

        int percent = 5;

        //declare float variable to store the balance + interest at different years
        float firstYear, secondYear, thirdYear;

        firstYear = (( principle * 1 * percent ) / 100 ) + principle;
        secondYear = (( principle * 2 * percent ) / 100) + principle;
        thirdYear = (( principle * 3 * percent ) / 100) + principle;

        System.out.println("Balance of the account on the first year is: " + firstYear );
        System.out.println("Balance of the account on the second year is: " + secondYear );
        System.out.println("Balance of the account on the third year is: " + thirdYear );
    }
}