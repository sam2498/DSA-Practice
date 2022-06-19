class Solution {
    public int maximumWealth(int[][] accounts) {
        
        
        int m=accounts.length;
        int n=accounts[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(j!=0){
                    accounts[i][j]=accounts[i][j-1]+accounts[i][j];
                }
                
            }
        }
        int max=-1;
        for(int i=0;i<m;i++){
            if(accounts[i][n-1]>max){
                max=accounts[i][n-1];
            }
        }
        return max;
    }
}