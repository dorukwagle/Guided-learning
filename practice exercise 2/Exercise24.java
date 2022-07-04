//resistance calculator on the given circuit in exercise 24.

import java.util.Scanner;

public class Exercise24 {
    public float totalResistance(float r1, float r2, float r3){
        // r2 and r3 are in parallel lets assume them rp
        // now rp and r1 are in series

        //calculate the resistance in parallel
        float rp = 1 / r2 + 1 / r3;
        
        //now calculate and return total resistance
        return r1 + rp;
    }
    public static void main(String[] args) {
        float r1, r2, r3;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of first, second and third resistors (i.e. R1,R2 and R3) respectively: ");;
        r1 = scn.nextFloat();
        r2 = scn.nextFloat();
        r3 = scn.nextFloat();
        scn.close();
        
        Exercise24 ex = new Exercise24();
        float totalR = ex.totalResistance(r1, r2, r3);
        System.out.println("The total resistance of the circuit is: " + totalR);
    }    
}
