class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < 9 ; i++){
            Set<Character> rows = new HashSet<>();
            Set<Character> columns = new HashSet<>();
            Set<Character> box = new HashSet<>();
            for(int j = 0 ; j < 9 ; j++){
                // Check Row
                if(board[i][j] != '.' && !rows.add(board[i][j])){
                    return false;
                }
                // Check Column
                if(board[j][i] != '.' && !columns.add(board[j][i])){
                    return false;
                }
                // check boxes
                int rowIndex = (3 * (i / 3)) + (j / 3);
                int colIndex = (3 * (i % 3)) + (j % 3);
                if(board[rowIndex][colIndex] != '.' && !box.add(board[rowIndex][colIndex])){
                    return false;
                }
            }
        }
        return true;
    }
}