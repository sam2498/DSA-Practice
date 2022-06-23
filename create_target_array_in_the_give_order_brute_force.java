class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int n = nums.length;
        List<Integer> target = new ArrayList<Integer>(n);
        
        for(int i=0;i<n;i++){
            target.add(index[i],nums[i]);
        }
        
        
        for(int i=0;i<n;i++){
            
            nums[i]=target.get(i);
            
        }
        
        return nums;
    }
}