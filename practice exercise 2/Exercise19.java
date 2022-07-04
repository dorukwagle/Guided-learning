/*
 * The following pseudocode describes how a bookstore computes the price
of an order from the total price and the number of the books that were
ordered.
Read the total book price and the number of books.
Compute the tax (7.5 percent of the total book price).
Compute the shipping charge (£2 per book).
The price of the order is the sum of the total book price, the tax, and
the shipping charge.
Print the price of the order.
 */

import java.util.Scanner;

public class Exercise19 {
    float tax = 7.5f;
    int shippingCharge = 2;

    public float getTotalPrice(float bookPrice, int bookNo){
        float priceWithTax = bookPrice + tax / 100 * bookPrice;
        float totalPrice = priceWithTax + shippingCharge * bookNo;
        return totalPrice;
    }

    public static void main(String[] args) {
        float totalBookPrice;
        int noOfBooks;

        Scanner scn = new Scanner(System.in);
        Exercise19 ex = new Exercise19();

        System.out.print("Enter the total price of books: ");
        totalBookPrice = scn.nextFloat();
        System.out.print("Enter total no. of books: ");
        noOfBooks = scn.nextInt();
        scn.close();

        float totalPrice = ex.getTotalPrice(totalBookPrice, noOfBooks);
        System.out.println("total price of teh order is: Rs " + totalPrice);
    }
}
