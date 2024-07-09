class Solution {
    public int findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num: nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
    public int addedInteger(int[] nums1, int[] nums2) {
        return findMin(nums2) - findMin(nums1);
    }
}