class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> sum = new ArrayList<>();
        for(int i=0;i<accounts.length;i++){
            int s=0;
            for (int j=0;j<accounts[i].length;j++){
                s=s+accounts[i][j];    
            }
        sum.add(s);    
        }
        System.out.print(sum);
        return Collections.max(sum);      
    }    
}//very very conceptual question i completed using ArrayList<Integer> sum= new ArrayList<>(); and Collections is a class to help find min and max values in an array list.
