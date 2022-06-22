class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int n = nums.length;
        int[] freq = new int[100];
        
        for(int i=0;i<n;i++){
            freq[i]=0;
        }
        
        for(int i=0;i<n;i++){
            
            freq[nums[i]-1]++;
            
        }
        int goodPair=0;
        for(int i=0;i<100;i++){
            
            if(freq[i]!=1){
                goodPair=goodPair+((freq[i]*(freq[i]-1))/2);
            }
        }
        
        return goodPair;
    }
}