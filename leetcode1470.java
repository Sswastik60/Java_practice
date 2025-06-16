class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x=new int[nums.length/2];
        int[] y=new int[nums.length/2];
        int[] z=new int[nums.length];
        for(int i=0;i<nums.length/2;i++){
            x[i]=nums[i];
            y[i]=nums[i+n];
        }
        for(int j=0;j<nums.length/2;j++){
            z[j*2]=x[j];
            z[(j*2)+1]=y[j];
        }
        return z;                           
    }
}//Swaparrays
