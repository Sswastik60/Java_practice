import java.util.Scanner;
// Armstrong_number.java
public class Armstrong_number {
    Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        boolean result = armstrong();
        if (result==true) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }
        
    }
    static boolean armstrong(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        int originalNum = num;
        int sum = 0;
        while (num>0) {
            int digit = num % 10;
            sum += digit * digit * digit; // For 3-digit Armstrong number
            num /= 10;
        }
        if (sum== originalNum) {
            return true; // It is an Armstrong number
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
            return false; // It is not an Armstrong number
        }
        
    }
}