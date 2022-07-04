/*
 * Easter Sunday is the first Sunday after the first full moon of spring. To
compute the date, you can use this algorithm, invented by the
mathematician Carl Friedrich Gauss in 1800:
 */

import java.util.Scanner;

public class Exercise18 {
    
    public String getMonth(int month){
        String months = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        return months.substring((month -1) * 9, month * 9);
    }
    public String getEasterSunday(int year){
        int y = year;
        int a = y % 19;
        int b = y / 100; //get quotient
        int c = y % 100; //get remainder
        int d = b / 4; //get quotient
        int e = b % 4; //get remainder
        int g = (8 * b + 13) / 25; //get quotient
        int h = ( 19 * a + b - d - g + 15 ) % 30; // get remainder
        int j = c / 4; //get quotient
        int k = c % 4; //get remainder
        int m = ( a + 11 * h) / 319; //get quotient
        int r = (2 * e + 2 * j - k - h + m + 32) % 7; //get remainderr
        int n = ( h - m + r + 90 ) / 25; //get quotient
        int p = ( h - m + r + n + 19 ) % 32; //get remainder

        String month = getMonth(n);
        return "Easter Sunday of " + y + " is: " + month.trim() + " " + p;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the year to get its Easter Sunday: ");
        int year = scn.nextInt();

        Exercise18 ex = new Exercise18();
        String easter = ex.getEasterSunday(year);
        System.out.println(easter);
    }
}
