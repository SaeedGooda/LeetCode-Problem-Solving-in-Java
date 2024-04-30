class Solution {
    int[][] dir = {{0, 1}, {1, 0}, {1, 1}, {0, -1}, {-1, 0}, {-1, 1}, {1, -1}, {-1, -1}};
    public void gameOfLife(int[][] board) {
        int [][] copy = new int[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                int neighbors = getNumOfNeighbors(board, i, j);
                if(board[i][j] == 1 && (neighbors < 2 || neighbors > 3)){
                    copy[i][j] = 0;
                }
                else if(board[i][j] == 0 && neighbors == 3){
                    copy[i][j] = 1;
                }
                else{
                    copy[i][j] = board[i][j];
                }

            }
        }
        for(int i = 0; i < board.length ; i++){
            for (int j = 0 ; j < board[i].length ; j++){
                board[i][j] = copy[i][j];
            }
        }
    }

    private int getNumOfNeighbors(int[][] board, int i, int j) {
        int count = 0;
        for(int[] d: dir){
            int x = d[0] + i;
            int y = d[1] + j;
            if(x >= 0 && x < board.length && y >= 0 && y < board[0].length){
                count += board[x][y];
            }
        }
        return count;
    }
}