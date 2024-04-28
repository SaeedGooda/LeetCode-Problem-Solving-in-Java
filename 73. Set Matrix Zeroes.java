// solution 1, Space = O(n+m)
class Solution {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i = 0; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int a: rows){
            for(int i = 0 ; i < matrix[0].length ; i++){
                matrix[a][i] = 0;
            }
        }
        for(int a: cols){
            for(int i = 0 ; i < matrix.length ; i++){
                matrix[i][a] = 0;
            }
        }
    }
}

// Solution 2, Space = O(1)
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row0 = false, col0 = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0 ; i < cols ; i++){
            if(matrix[0][i] == 0){
                row0 = true;
            }
        }
        for(int i = 0 ; i < rows ; i++){
            if(matrix[i][0] == 0){
                col0 = true;
            }
        }
        for(int i = 1 ; i < rows ; i++){
            for(int j = 1 ; j < cols ; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1 ; i < rows ; i++){
            for(int j = 1 ; j < cols ; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(row0){
            for(int i = 0 ; i < cols ; i++){
                matrix[0][i] = 0;
            }
        }
        if(col0){
            for(int i = 0; i < rows ; i++){
                matrix[i][0] = 0;
            }
        }
    }
}