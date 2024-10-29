class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numOfGoodPairs = 0;
        int len = nums.length;
        for(int i = 0 ; i < len-1 ; i++){
            for(int j = i+1 ; j < len ; j++){
                if(nums[i] == nums[j]){
                    numOfGoodPairs++;
                }
            }
        }
        return numOfGoodPairs;
    }
}