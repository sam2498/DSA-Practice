class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       
        int n = candies.length;
        int maxCandies=-1;
        for(int i=0;i<n;i++){
            if(maxCandies<candies[i]){
                maxCandies=candies[i];
            }
        }
        List<Boolean> candyKing = new ArrayList<Boolean>(n);
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=maxCandies){
                candyKing.add(true);
            }
            else
                candyKing.add(false);
        }
        return candyKing;
    }
}