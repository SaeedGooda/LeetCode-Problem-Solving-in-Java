class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length-1;
        int index = nums.length-1;
        while(left <= right){
            int rightSquare = nums[right] * nums[right];
            int leftSquare = nums[left] * nums[left];
            if(rightSquare > leftSquare){
                result[index] = rightSquare;
                right--;
            } else{
                result[index] = leftSquare;
                left++;
            }
            index--;
        }
        return result;
    }
}