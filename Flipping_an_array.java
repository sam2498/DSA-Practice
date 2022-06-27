class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n = image.length;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n/2;j++){
                
                if(image[i][j]!=image[i][n-j-1]){
                    if(image[i][j]==0){
                        image[i][n-j-1]=0;
                        image[i][j]=1;
                    }
                    else{
                        image[i][n-j-1]=1;
                        image[i][j]=0;
                    }
                }
            }        
            
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]==0)
                    image[i][j]=1;
                else
                    image[i][j]=0;
            }
            
        }
        return image;
    }
}