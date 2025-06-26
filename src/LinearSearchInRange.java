public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr={1,20,4,6,9,21};
        int tgt=9;
        int startingidx=1;
        int endingidx=6;
        System.out.print(search(startingidx,endingidx,arr,tgt));
    }

    static int search(int strt, int end, int[] array, int target) {
        for (int i = strt; i <= end; i++) {
            int element = array[i];
            if (element == target) {
                return i;
            }
        }
        return -1; // ❗ only return -1 if NOT found after full loop
    }
}
