class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int l=2*n;
        
        for(int i=n;i<l;i++){
            nums[i]=nums[i]+1024*nums[i-n];
            
        }
        int index=0;
        for(int i=n;i<l;i++){
            
            nums[index] = nums[i]/1024;
            nums[index+1]=nums[i]%1024;
            
            index=index+2;
        }
        
        return nums;
    }
}