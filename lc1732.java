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

//much efficient code
/*class Solution {
  public int largestAltitude(int[] gain) {
    int currentAltitude = 0;
    // Highest altitude currently is 0.
    int highestPoint = currentAltitude;

    for (int altitudeGain : gain) {
      // Adding the gain in altitude to the current altitude.
      currentAltitude += altitudeGain;
      // Update the highest altitude.
      highestPoint = Math.max(highestPoint, currentAltitude);
    }

    return highestPoint;
  }
}*/
