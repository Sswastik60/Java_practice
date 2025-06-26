import java.util.Scanner;

public class Counting_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be counted: ");
        int i=in.nextInt();
        int count = 0;
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        int rem=number%10;
        while (number > 0) {
            rem = number % 10;
            if (rem == i) {
                count++;
            }
            number = number / 10;
        }
        System.out.println("The number of times " + i + " occurs in the number is: " + count);
    }
    
}
