class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // get first and last occurence when element is greater then the next element
        int len = nums.length;
        int firstIndex = -1, lastIndex = -1;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0 ; i < len ; i++){
            if(max > nums[i]){
                lastIndex = i;
            } else{
                max = nums[i];
            }

            if(min < nums[len - i - 1]){
                firstIndex = len - i - 1;
            } else{
                min = nums[len - i - 1];
            }
        }
        return firstIndex == -1 ? 0 : lastIndex - firstIndex + 1;
    }
}