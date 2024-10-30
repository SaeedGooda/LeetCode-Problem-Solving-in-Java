// Solution 1 - Time = O(n^2)

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0){
            return 0;
        }
        int count = 0;
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            int product = 1;
            for(int j = i ; j < len ; j++){
                product *= nums[j];
                if(product >= k){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}

// Solution 2 - Time = O(n)

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1){
            return 0;
        }
        int count = 0;
        int product = 1;
        int left = 0;
        for(int right = 0 ; right < nums.length ; right++){
            product *= nums[right];
            while(product >= k){
                product /= nums[left++];
            }
            count += right - left + 1;
        }
        return count;
    }
}