/*
Bicyclists can calculate their speed if the gear size and cadence is known.  
Gear size refers to the effective diameter of the wheel.  Gear size multiplied by pi (3.14) gives the 
distance travelled with one turn of the pedals. Cadence refers to the number of pedal revolutions per minute (rpm). The 
speed in miles per hour is calculated by the following:

This is a program that calculates the speed for a gear size of 100 inches and a cadence of 90 rpm.  
This would be considered a high cadence and a maximum gear size for a typical bicycle. 
1/12 will result in 0, because both 1 and 12 are integers, and when the
integer division is performed, the fractional part is discarded.
*/
//1,1,1,1,

public class Project6 {
    public static void main(String[] args) {
        final float PI = 22 / 7;
        //declare meter constant to convert meter to miles, 1 mile = 1609.34 meter
        final float METERCONSTANT = 1609.34f;
        //gear size in meter
        float gearSize = 100 * 0.025f;
        //cadance in rpm
        float cadance = 90;

        //circumference of wheel
        float circumference = gearSize * PI;

        //calculate total distance covered in 1 hour in meter
        float totalDistanceCovered = gearSize * cadance * 60; // 60 is for 1 hour

        //finally convert meter to miles,
        float mph = totalDistanceCovered / METERCONSTANT;
        System.out.println("The speed of bycicle is: " + mph + " mph");
    }
}
