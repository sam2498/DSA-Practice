class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n = nums.length;
        int[] smallCheck = new int[101];
        
        for(int i=0;i<101;i++){
            smallCheck[i]=0;
        }
        
        
        for(int i=0;i<n;i++){
            smallCheck[nums[i]]++;
        }
        
        int t=n;
        for(int i=100;i>=0;i--){
            
            if(smallCheck[i]!=0){
                smallCheck[i]=t-smallCheck[i];
                t=smallCheck[i];
            }
        }
        
        for(int i=0;i<n;i++){
            
            nums[i]=smallCheck[nums[i]];
        }
        return nums;
    }
}