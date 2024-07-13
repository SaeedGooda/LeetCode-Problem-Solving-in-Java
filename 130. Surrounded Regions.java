class Solution {
    public void dfs(char[][] board, int i, int rows, int j, int cols){
        if(i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != 'O'){
            return;
        }
        board[i][j] = '*';
        dfs(board, i+1, rows, j, cols);
        dfs(board, i-1, rows, j, cols);
        dfs(board, i, rows, j+1, cols);
        dfs(board, i, rows, j-1, cols);
    }
    public void solve(char[][] board) {
        if(board == null || board.length == 0){
            return;
        }
        int rows = board.length;
        int cols = board[0].length;
        // Mark Columns Border with a temp marker
        for(int i = 0 ; i < rows ; i++){
            if(board[i][0] == 'O'){
                dfs(board, i, rows, 0, cols);
            }
            if(board[i][cols-1] == 'O'){
                dfs(board, i, rows, cols-1, cols);
            }
        }
        // Mark Rows Border with a temp marker
        for(int i = 0 ; i < cols ; i++){
            if(board[0][i] == 'O'){
                dfs(board, 0, rows, i, cols);
            }
            if(board[rows-1][i] == 'O'){
                dfs(board, rows-1, rows, i, cols);
            }
        }
        // Flip O to X and return temp marker * to O
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                } else if(board[i][j] == '*'){
                    board[i][j] = 'O';
                }
            }
        }

    }
}