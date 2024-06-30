class Solution {
    public boolean isValid(int i, int n, int j, int m){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
    public void dfs(char[][] grid, int i, int n, int j, int m){
        if(!isValid(i, n, j, m) || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i+1, n, j, m);
        dfs(grid, i-1, n, j, m);
        dfs(grid, i, n, j+1, m);
        dfs(grid, i, n, j-1, m);
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, grid.length, j, grid[i].length);
                    count++;
                }
            }
        }
        return count;
    }
}