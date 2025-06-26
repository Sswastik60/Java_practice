import java.util.Scanner;

public class oddandeven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to be checked for odd and even: ");
        int num=in.nextInt();
        boolean ans=iseven(num);
        if(ans==true){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        in.close();
    }
    static boolean iseven(int num){
        if(num%2==0){
            return true;
        } else {
            return false;
        }
    }
    
}
