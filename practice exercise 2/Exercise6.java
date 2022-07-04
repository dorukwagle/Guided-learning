/*
 * Write a program that prompts the user for a radius and then prints:
- The area and circumference of a circle with that radius
- The volume and surface area of a sphere with that radius
 */

import java.util.Scanner;

public class Exercise6 {
    public static final float PI = 22/7;

    public float area(float radius){
        return PI * radius * radius;
    }

    public float circumference(float radius){
        return PI * radius * 2;
    }

    public float volume(float radius){
        return 4/3 * PI * (float) Math.pow(radius, 3);
    }

    public float surfaceArea(float radius){
        return 4 * PI * radius * radius;
    }

    public static void display(String str, float number){
        System.out.println(str + number);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Exercise6 circle = new Exercise6();

        System.out.print("Enter the radius of circle in: ");
        float radius = inp.nextFloat();

        float circleArea = circle.area(radius);
        float circleCircumference = circle.circumference(radius);
        float circleVolume = circle.volume(radius);
        float circleSurfaceArea = circle.surfaceArea(radius);

        display("Area of circle is ", circleArea);
        display("Circumference of circle is ", circleCircumference);
        display("Volume of circle is ", circleVolume);
        display("Surface area of circle is ", circleSurfaceArea);

    }
}

