class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int[] tcandies= new int[candies.length]; 
        for(int i=0;i<candies.length;i++){
            tcandies[i]=candies[i]+extraCandies;
        }
        int l=candies[0];
        for(int j=0;j<candies.length;j++){
            if(candies[j]>l){
                l=candies[j];
            }
        }
        for(int k=0;k<candies.length;k++){
            if (tcandies[k]>=l){
            ans.add(true);
        }else ans.add(false);
        }
        return ans;
    }                   
}
