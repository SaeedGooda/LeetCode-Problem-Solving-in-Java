class Solution {
    private static final int[] DX = {0, 0 , 1 , -1};
    private static final int[] DY = {1, -1 , 0 , 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(color != originalColor){
            dfs(image, sr, sc, color, originalColor);
        }
        return image;       
    }

    public void dfs(int[][] image, int sr, int sc, int color, int originalColor){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != originalColor){
            return;
        }
        image[sr][sc] = color;
        for(int i =  0 ; i < 4 ; i++){
            dfs(image, sr + DX[i], sc + DY[i] , color, originalColor);
        }
    }
}