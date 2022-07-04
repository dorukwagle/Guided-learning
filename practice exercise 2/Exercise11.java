/*
 * Write a program that reads a number between 1,000 and 999,999 from
the user and prints it with a comma separating the thousands. Here is a
sample dialog:
 */

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        String numberComma, number;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer between 1000 and 999999: ");
        number = scn.nextLine();

        int len = number.length();
        numberComma = number.substring(0, len - 3) + "," + number.substring(len - 3); 
        System.out.println(numberComma);
    }
}
