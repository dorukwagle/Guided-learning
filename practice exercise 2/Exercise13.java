/*
 * Write a program that reads in an integer and breaks it into a sequence of
individual digits. For example, the input 16384 is displayed as
1 6 3 8 4
You may assume that the input has no more than five digits and is not
negative.
 */

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        String number;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number between 10 and 99999: ");
        number = scn.nextLine();

        int len =  number.length();
        for(int i = 0; i < len; i++ ){
            System.out.print(number.charAt(i) + "  ");
        }
        System.out.print("\n");
    }
}
