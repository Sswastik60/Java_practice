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



/* class Solution {
    public int maximumWealth(int[][] arr) {
        int sum = 0;
        int sum1 = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum = sum + arr[i][j];                              //This is a much efficient way very good solution
            }
            if(sum>=sum1){
                sum1 = sum;
                sum = 0;
            }
            else{
                sum = 0;
            }
        }
        return sum1;
        
    }
}*/
