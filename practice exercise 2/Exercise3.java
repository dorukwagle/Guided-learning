
/*
 * Write a program that reads a number and displays the square, cube, and
fourth power. Use the Math.pow method only for the fourth power.
 */
import java.util.Scanner;
public class Exercise3 {
    
    public int square(int number){
        return number * number;
    }
    public long cube(int number){
        number = number * number * number;
        return number;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number, square;
        long cube, fourth;

        System.out.print("Enter a number to calculate its square, cube and fourth power:");
        number = scn.nextInt();

        fourth = (long) Math.pow(number, 4);

        Exercise3 calc = new Exercise3();
        square = calc.square(number);
        cube = calc.cube(number);

        System.err.printf("Square: %d\nCube: %d\nFourth: %d \n", square, cube, fourth);
    }
}
