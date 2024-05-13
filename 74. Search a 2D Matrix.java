// Solution 1 ---> Time Complexity = O(n*m)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}

// Solution 2 --> Time Complexity = O(logn) + O(logm)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = cols - 1;
        int top = 0, bottom = rows - 1;
        int row = -1;
        while(top <= bottom){
            row = (top + bottom) / 2;
            if(target > matrix[row][cols-1]) {
                top = row + 1;
            } else if(target < matrix[row][0]){
                bottom = row - 1;
            } else{
                break;
            }
        }
        if(row == -1){
            return false;
        }
        while(left <= right){
            int mid = (left + right) / 2;
            if(target == matrix[row][mid]){
                return true;
            } else if(target > matrix[row][mid]){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return false;
    }
}