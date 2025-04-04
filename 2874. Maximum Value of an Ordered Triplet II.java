class Solution {
    public long maximumTripletValue(int[] nums) {
        long result = 0;
        int maxI = nums[0];
        int maxDiff = Integer.MIN_VALUE;

        for (int j = 1; j < nums.length - 1; j++) {
            maxDiff = Math.max(maxDiff, maxI - nums[j]);
            maxI = Math.max(maxI, nums[j]);
            result = Math.max(result, (long) maxDiff * nums[j + 1]);
        }
        return result;
    }
}