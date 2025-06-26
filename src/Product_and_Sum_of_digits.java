import java.util.Scanner;

public class Product_and_Sum_of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Example number
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; // Get the last digit
            product=product*digit;    // Multiply to product
            sum =sum+ digit;       // Add to sum
            n /= 10;            // Remove the last digit
        }

        System.out.println("Product of digits: " + product);
        System.out.println("Sum of digits: " + sum);
    }
}
