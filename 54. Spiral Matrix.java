class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length;
        int left = 0, right = matrix[0].length;
        while(top < bottom && left < right){
            // LEFT TO RIGHT
            for(int i = left ; i < right ; i++){
                result.add(matrix[top][i]);
            }
            top++;
            // TOP TO BOTTOM
            for(int i = top ; i < bottom ; i++){
                result.add(matrix[i][right-1]);
            }
            right--;
            if(!(left < right && top < bottom)){
                break;
            }
            // RIGHT TO LEFT
            for(int i = right-1 ; i >= left ; i--){
                result.add(matrix[bottom-1][i]);
            }
            bottom--;
            // BOTTOM TO TOP
            for (int i = bottom-1 ; i >= top ; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }
}