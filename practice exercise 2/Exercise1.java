/*
 * Write a program that displays the dimensions of a letter-size (8.5 × 11
inches) sheet of paper in millimeters. There are 25.4 millimeters per inch.
Use constants and comments in your program.
 */

 public class Exercise1 {
    public static final float INCH_MM_CONSTANT = 25.4f;

    public float inchToMm(float inches){
        return inches * INCH_MM_CONSTANT;
    }
    public static void main(String[] args) {
        float breadth = 8.5f;
        float length = 11f;
        Exercise1 conv = new Exercise1();

        System.out.printf("The dimensions of letter are: %f * %f", conv.inchToMm(breadth), conv.inchToMm(length));
    }
 }