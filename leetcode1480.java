class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum= new int[nums.length];
            for (int i = 0; i < nums.length ; i++) {
                int k = sum(nums[i]);
                runningSum[i]=k;
            }
            return runningSum;
        }
        int s=0;
        public int sum(int a){
            s=s+a;
            return s;
        }
    }
