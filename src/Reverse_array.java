import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int c= arr.length;
        for (int i = 0; i <arr.length/2; i++) {
            int k=i;
            c=c-1;
            swap(arr,k,c);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    }

