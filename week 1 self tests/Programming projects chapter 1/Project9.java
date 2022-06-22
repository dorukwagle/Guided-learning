/*
  A simple rule to estimate your ideal body weight is to allow 110 pounds for the first 5 feet of height and 
  5 pounds for each additional inch.  Write a program with a variable for the height of a person in feet and 
  another variable for the additional inches.  Assume the person is at least 5 feet tall.  For example, a person 
  that is 6 feet and 3 inches tall would be represented with a variable that stores the number 6 and another 
  variable that stores the number 3.  Based on these values, calculate and output the ideal body weight.
 */

public class Project9 {
    public static void main(String[] args) {
        int totalFeet = 6;
        int totalInche = 4;

        int idealWeight;

        idealWeight = (totalFeet / 5) * 110; //since 5 feet can have 110 pound weight
        totalFeet %= 5;

        //now add remaining feet to the inches
        totalInche += totalFeet * 12; //since 1 feet = 12 inch

        idealWeight += totalInche * 5; //since 5 pounds for each extra inch

        System.out.println("Your ideal body weight is: " +  idealWeight + " pounds");
    }
}
