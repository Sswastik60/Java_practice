public class Maximum_value_of_an_array {
    public static void main(String[] args) {
        int[] arr={1,6,3,4,5};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int Maxval=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>Maxval){
                Maxval=arr[i];
            }
        }
        return Maxval;
    }
}
