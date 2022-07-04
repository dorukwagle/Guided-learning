import java.util.Scanner;

public class Exercise26 {
    int rNot = 1075;
    int tNot = 85 + 273;
    int beta = 3969;

    public float getTemperature(float resistance){
        float tempC = (float) (( beta * tNot) / ((tNot * Math.log(resistance / rNot)) + beta) - 273);
        return tempC;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the thermistor resistance: ");
        float therResistance =  scn.nextFloat();
        scn.close();

        Exercise26 ex = new Exercise26();
        float tempC = ex.getTemperature(therResistance);
        System.out.println("The liquid temperature is " + tempC + " degree celcius.");
    }    
}
