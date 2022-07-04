/*
 * Write a program that transforms numbers 1, 2, 3, ..., 12 into the
corresponding month names January, February, March, ..., December.
Hint: Make a very long string "January February March ...", in which you
add spaces such that each month name has the same length. Then use
substring to extract the month you want.
 */
import java.util.Scanner;

public class Exercise16 {
    public String getMonth(int month){
        String months = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        return months.substring((month -1) * 9, month * 9);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int month = scn.nextInt();

        Exercise16 ex = new Exercise16();

        System.out.println(ex.getMonth(month));
    }
}
