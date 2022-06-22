/*
 * A government research lab has concluded that an artificial sweetener commonly used in diet soda pop will cause 
 * death in laboratory mice.  A friend of yours is desperate to lose weight but cannot give up soda pop.  
 * Your friend wants to know how much diet soda pop it is possible to drink without dying as a result.  

Write a program to supply the answer. The program has no input but does have defined constants for the following 
items: the amount of artificial sweetener needed to kill a mouse, the weight of the mouse, the starting weight of 
the dieter, and the desired weight of the dieter. To ensure the safety of your friend, be sure the program uses the 
weight at which the dieter will stop dieting, rather than the dieter’s current weight, to calculate how much soda pop 
the dieter can safely drink. You may use any reasonable values for these defined constants. Assume that diet soda 
contains 1/10th of 1% artificial sweetener. Use another named constant for this fraction.

You may want to express the percent as the double value 0.001. (If your program turns out not to use a 
defined constant, you may remove that defined constant from your program.)
 */

public class Project4 {
    public static void main(String[] args) {
        // amount of sweetener to kill a mouse in gram
        final float amtSweetener = 8;
        //weight of mouse in gram
        final float mouseWt = 800;

        
        //current weight and desired weight of dieter in gram. 1kg = 1000 gram.
        final int startingWtOfDieter = 103 * 1000;
        final int desiredWt = 60 * 1000;
        
        //pop soda weight in gram
        final float sodaWeight = 200;
        //amount of sweetener in pop soda ( given in question )
        final float sweetenerPercent = 0.001f;
        
        //calculate sweetener to body weight ratio. and store as percentage
        float deadlyDosage = (float) ((amtSweetener / mouseWt) * 100);

        // to be in the safe side we will assume 0.4% less than the deadlyDosage to be consumed without being dead
        // we will also take the desiredWt as the actual weight of the dieter rather than the current weight as asked in the question
        float safeDosagePercent = (float) (deadlyDosage - 0.4);
        
        //actual weight of sweetener which is safe for him to consume
        float safeDosage = desiredWt * safeDosagePercent/100;

        //total sweetener contained in 1 soda pop in gram
        float sweetenerInSoda = (float) (sodaWeight * sweetenerPercent);

        //total soda pop he can consume without being dead
        float totalConsumableSoda = safeDosage / sweetenerInSoda;

        System.out.println("You can consume total number of " + totalConsumableSoda + " diet soda pop without being dead");

    }
}
