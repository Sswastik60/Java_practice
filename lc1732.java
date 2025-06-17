class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> altitude=new ArrayList<Integer>(10);
        altitude.add(0,0);
        int l=0;
        int m=0;
        int k=0;
        for(int i=0;i<gain.length;i++){
            l=gain[i];
            m=k+l;
            k=m; 
            altitude.add(i+1,m);  
        }
        return Collections.max(altitude);
    }
}
