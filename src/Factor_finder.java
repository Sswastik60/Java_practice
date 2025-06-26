import java.util.Scanner;

public class Factor_finder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int n = scanner.nextInt(); // Read the number from user input 
        if (n>0) {
            for (int i = 1; i!=n; i++) {
                if (n%i==0) {
                    System.out.println("Factor: " + i); // Print the factor
                }else {
                    continue; // Continue to next iteration if not a factor
                }
                
            }    
        }
        else {
            System.out.println("Please enter a valid integer.");
        }
    }
}