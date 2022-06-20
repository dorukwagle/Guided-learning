public class ProductOfPositiveIntegers {
    public static void main(String[] args) {
        int i, product = 1;

        for(i = 1; i <= 10; i++){
            product *= i;
        }
        System.out.println("Product of first 10 positive integers is: " + product);
    }
}
