/*
 * The video game machines at your local arcade output coupons according to 
 * how well you play the game.  You can redeem 10 coupons for a candy bar or 3 coupons for a gumball.  
 * You prefer candy bars to gumballs.  Write a program that defines a variable initially assigned 
 * to the number of coupons you win.  Next, the program should output how many candy bars and gumballs 
 * you can get if you spend all of your coupons on candy bars first, and any remaining coupons on gumballs.
 */

public class CoupensArcadeGame {

    public static void main(String[] args){
    int couponsWon = 29;
    int candyCost = 10;
    int gumballCost = 3;

    int candyBars = couponsWon / candyCost;
    couponsWon %= candyCost;

    int gumballs = couponsWon / gumballCost;

    System.out.println("Total candy bars = " + candyBars );
    System.out.println("Total gumballs = " + gumballs );
    }
}
