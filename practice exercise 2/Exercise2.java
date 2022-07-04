/*
 * Write a program that computes and displays the perimeter of a letter-size
(8.5 × 11 inches) sheet of paper and the length of its diagonal.
 */

public class Exercise2 {
    
    public float perimeter(float length, float breadth){
        return 2 * (length + breadth);
    }
    public float diagonal(float length, float breadth){
        float diagonalSquare = (float) (Math.pow(length, 2) + Math.pow(breadth, 2));
        float diagonal = (float) Math.pow(diagonalSquare, 0.5);
        return diagonal;
    }
    public static void main(String[] args) {
        float length = 11f;
        float breadth = 8.5f;

        Exercise2 conv = new Exercise2();
        float diag = conv.diagonal(length, breadth);
        float perim = conv.perimeter(length, breadth);

        System.out.printf("Perimeter is: %.2f inche \nDiagonal is %.2f inche", perim, diag);
    }
}
