/*
 * The following pseudocode describes how to extract the dollars and cents
from a price given as a floating-point value. For example, a price 2.95
yields values 2 and 95 for the dollars and cents.
Assign the price to an integer variable dollars.
Multiply the difference price - dollars by 100 and add 0.5.
Assign the result to an integer variable cents.
Translate this pseudocode into a Java program. Read a price and print
the dollars and cents. Test your program with inputs 2.95 and 4.35.
 */

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Exercise21 ex = new Exercise21();

        System.out.print("Enter the price: ");
        float price = scn.nextFloat();
        scn.close();

        int dollar = (int) price;
        int cents = (int) ((price - dollar) * 100);
        System.out.printf("%d dollars and %d cents\n", dollar, cents);
    }
}