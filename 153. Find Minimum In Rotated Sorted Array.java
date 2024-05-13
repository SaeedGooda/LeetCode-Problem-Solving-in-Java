class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int left = 0, right = n-1;
        while(left <= right){
            if(nums[left] <= nums[right]){
                min = Math.min(min, nums[left]);
                break;
            }
            int mid = (left + right) / 2;
            min = Math.min(min, nums[mid]);
            if(nums[mid] >= nums[left]){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return min;
    }
}