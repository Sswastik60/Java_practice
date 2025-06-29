public class MinimumnumberLrsearch {
    public static void main(String[] args) {
        int[] arr={5,3,4,2,1,0,-1,-2,12,100,-101,-109,0,-1000};
        int k= mini(arr);
        System.out.println(k);
    }

//    min function
    static int mini(int[] array){
        int curnum=0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i-1]<array[i]){
                curnum=array[i-1];
            }
            else curnum=array[i];
        }
        return curnum;
    }
}
