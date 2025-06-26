import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        boolean ans=isPrime(n);
        System.out.println(n + " is it prime: " + ans);
        in.close();
    }
    static boolean isPrime(int n){
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {//math.sqrt(n) is used for efficiency
            // Check divisibility from 2 to the square root of n
            // If n is divisible by any of these, it is not prime
            if (n % i == 0) {
                return false; // n is divisible by i, hence not prime
            }
        }
        return true; // n is prime
    }
}