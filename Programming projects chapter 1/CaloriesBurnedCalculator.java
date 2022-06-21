/*
One way to measure the amount of energy that is expended during exercise is to use metabolic equivalents (MET).
Here are some METS for various activities:

Running 6 MPH: 10 METS
Basketball: 8 METS
Sleeping: 1 MET

The number of calories burned per minute may be estimated using the following formula:

CaloriesjMinute = 0.0175 * MET * Weight in kilograms

Write a program that calculates and outputs the total number of calories burned for a 150-pound person
who runs 6 MPH for 30 minutes,
plays basketball for 30 minutes, and then sleeps for 6 hours.  One kilogram is equal to 2.2 pounds.
 */

public class CaloriesBurnedCalculator{
    public static void main(String[] args) {
        // store calories burned in certain activities in MET
        int caloriesRunning = 10;
        int caloriesBasketball = 8;
        int caloriesSleeping = 1;

        float weightInKg = 150 / 2.2f;
        
        float totalRunningCalories = ( float ) (( 0.0175 * caloriesRunning * weightInKg) * 30 );
        float totalBasketballCAlories = ( float ) (( 0.0175 * caloriesBasketball * weightInKg) * 30 );
        float totalSleepingCalories = ( float ) ((( 0.0175 * caloriesSleeping * weightInKg)) * 60 * 6 );

        float totalCaloriesBurned = totalRunningCalories + totalBasketballCAlories + totalSleepingCalories;

        System.out.println("Total calories burned by the person of 150 pound who runs 6 MPH for 30mins" +
        " plays basketball for 30mins and speeps 6 hours is: " + totalCaloriesBurned );
    }
}