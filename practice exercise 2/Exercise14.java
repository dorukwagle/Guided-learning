
/*
* Write a program that reads two times in military format (0900, 1730) and
prints the number of hours and minutes between the two times. Here is a
sample run.
Please enter the first time: 0900
Please enter the second time: 1730
8 hours 30 minutes
Extra credit if you can deal with the case where the first time is later than
the second:
Please enter the first time: 1730
Please enter the second time: 0900
15 hours 30 minutes
*/

import java.util.Scanner;


public class Exercise14 {
    int time1, time2;

    Exercise14(int time1, int time2){
        this.time1 = time1;
        this.time2 = time2;
    }

    public boolean checkValid(int time){
        int hours, minutes;
        hours = time / 100;
        minutes = time % 100;
        if(hours > 23 || minutes > 59)
            return false;
        return true;
    }

    public String normalDiff(){
        int hourDiffs, minDiffs;
        hourDiffs = time2 / 100 - time1 / 100;
        minDiffs = time2 % 100 - time1 % 100;

        //check if the minutes if time1 is greater than time2 minutes, the minDiffs value becomes negative
        if(minDiffs < 0){
            hourDiffs -= 1;
            minDiffs = 60 + minDiffs; //since midDiffs is negative it will subtract minDiffs from 60
        }
        return hourDiffs + " hours " + minDiffs + " minutes";
    }

    public String greaterDiff(){
        int hourDiffs, minDiffs;
        int totalHours = 24;
        hourDiffs = time1 / 100 - time2 / 100;
        minDiffs = time1 % 100 - time2 % 100;

        hourDiffs = totalHours - hourDiffs;

        //check if the minutes if time2 is greater than time1 minutes, the minDiffs value becomes negative
        if(minDiffs < 0){
            hourDiffs -= 1;
            minDiffs = 60 + minDiffs; //since midDiffs is negative it will subtract minDiffs from 60
        }
        return hourDiffs + " hours " + minDiffs + " minutes";
    }
    public static void main(String[] args) {
        String timeDifference = "";

        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the starting time in military format:(e.g 0900): ");
        int time1 = scn.nextInt();
        System.out.print("Enter the ending time in military format:(e.g 1300): ");
        int time2 = scn.nextInt();
        scn.close();
        
        Exercise14 ex = new Exercise14(time1, time2);
        if(!ex.checkValid(time1) || !ex.checkValid(time2) ){
            System.out.println("Invalid military time format");
            System.exit(1);
        }
        
        //check if time starting time is greater or less than ending time
        if(time1 < time2)
            timeDifference = ex.normalDiff();
        else
            timeDifference = ex.greaterDiff();
        
        System.out.println("The time difference is: " + timeDifference);
    }
}
