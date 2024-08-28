class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(exist(board, word, i, j, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean exist(char[][] board, String word, int i, int j, int matched){
        if(matched == word.length()){
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(matched)) {
            return false;
        }
        board[i][j] = '#';
        boolean result = exist(board, word, i - 1, j, matched + 1) || 
            exist(board, word, i, j - 1, matched + 1) || 
            exist(board, word, i + 1, j, matched + 1) ||  
            exist(board, word, i, j + 1, matched + 1);
        board[i][j] = word.charAt(matched);
        return result;
    }
}