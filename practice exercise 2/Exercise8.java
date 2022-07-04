/*
 * Write a program that asks the user to input:
 The number of gallons of gas in the tank
 The fuel efficiency in miles per gallon
 The price of gas per gallon
Then print the cost per 100 miles and how far the car can go with the gas
in the tank.
 */
import java.util.Scanner;

public class Exercise8 {
    public float efficiency = 0;

    public void setEfficiency(float effi){
        this.efficiency = effi;
    }

    public float getDistance(float gas){
        return gas * efficiency; // total distance that can be travelled with the fuel in the tank
    }

    public float getCost(int miles, float price){
        float requiredGas = miles / efficiency;
        return requiredGas * price; //returns the total cost required to travell given miles
    }

    public static void main(String[] args) {
        float gallons, efficiency, pricePerGallon;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of gallons of gas in the tank: ");
        gallons = inp.nextFloat();

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        efficiency = inp.nextFloat();

        System.out.print("Enter the price of gas per gallon: ");
        pricePerGallon = inp.nextFloat();
        inp.close();
        //store the given distance in a variable to calculate cost of travelling this distance
        int distance = 100;
        float distanceTravelled, cost;

        Exercise8 ex = new Exercise8();
        //now set the efficiency varaible to teh actual efficiency entered by the user
        ex.setEfficiency(efficiency);

        //distance that can be travelled by the car using the no. of gallons of gas in the tank
        distanceTravelled = ex.getDistance(gallons);
        cost = ex.getCost(distance, pricePerGallon);
        System.out.printf("Car can travel %.2f miles with %.2f gallons of fuel in the tank\nCost of travelling %d miles is %.2f\n",
        distanceTravelled, gallons, distance, cost);
    }
}
