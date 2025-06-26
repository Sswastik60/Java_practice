import java.util.Scanner;

public class Counting_Occurences {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character to be counted;");
        String input = in.next();
        System.out.print("Enter the string in which to count the character:");
        String str = in.next();
        int characterCount = str.length();
        System.out.println("The number of characters in the string is: " + characterCount);
        int a = 0;
        for (int j = 0; j <characterCount; j++) {
            if (str.trim().charAt(j) == input.trim().charAt(0)) {
                a=a+1;
                System.out.println("Character found at index: " + j);
                in.close();
            }
            
        }
            
        }
    }
