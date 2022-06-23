class Solution {
    public int largestAltitude(int[] gain) {
        
        int n = gain.length;
        int start=0,max=0;
        for(int i=0;i<n;i++){
            if(max<start+gain[i])
                max=start+gain[i];
            start=start+gain[i];
        }
        return max;
    }
}