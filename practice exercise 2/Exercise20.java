
/*
* The following pseudocode describes how to turn a string containing a ten-
digit phone number (such as "4155551212") into a more readable string
with parentheses and dashes, like this: "(415) 555-1212".

Take the substring consisting of the first three characters and
surround it with "(" and ") ". This is the area code.
Concatenate the area code, the substring consisting of the next
three characters, a hyphen, and the substring consisting of the last
four characters. This is the formatted number.
Translate this pseudocode into a Java program that reads a telephone
number into a string variable, computes the formatted number, and prints
it.
*/

import java.util.Scanner;

public class Exercise20 {

    public String format(String tel){
        String areaCode = "(" + tel.substring(0, 3) + ") ";
        String number = tel.substring(3, 6) + "-" + tel.substring(6);
        return areaCode + number;
    }
    public static void main(String[] args) {
        String telephone;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the 10 digit telephone no: ");   
        telephone = scn.nextLine();
        scn.close();

        Exercise20 ex = new Exercise20();
        String formattedNumber = ex.format(telephone);
        System.out.println(formattedNumber);        
    }
}