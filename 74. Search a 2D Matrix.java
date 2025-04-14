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

// Solution 2 --> Time Complexity = O(log n * m)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0){
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int left = 0;
        int right = rows * cols;

        while (left < right) {
            int mid = (left + right) / 2;
            int i = mid / cols;
            int j = mid % cols;
            
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] < target)
                left = mid + 1;
            else
                right = mid;
        }
        return false;
    }
}