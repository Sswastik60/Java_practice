import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class maxandmin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please input 3 different integers!!!");
        System.out.println("Enter first number: ");
        int a=in.nextInt();
        System.out.println("Enter second number: ");
        int b=in.nextInt();
        System.out.println("Enter third number: ");
        int c=in.nextInt();
        int d=maxi(a,b,c);
        int e=mini(a,b,c);
        System.out.println("Minimum:"+e);
        System.out.println("MaximumP:"+d);
    }
    static int maxi(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }
    static int mini(int a,int b,int c){
        if (a<b && b<c){
            return a;
        }
        else if (b<a && c<a) {
            return b;
        }
        else return c;
    }

}
