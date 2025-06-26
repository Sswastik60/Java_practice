import java.util.Scanner;

public class reverse_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = in.nextInt();
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append it to the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversedNum); // Output: Reversed Number: 54321
    }
    
}
