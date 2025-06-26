import java.util.Scanner;
public class Switch_and_Enhanced_Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a day (1-7): ");
         // 1 for Monday, 2 for Tuesday, ..., 7 for Sunday
         // Enhanced switch statement
         // Using the new switch expression syntax introduced in Java 12
         // This allows multiple case labels to be combined with commas
         // and eliminates the need for break statements.
        int day= in.nextInt();
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
    
}