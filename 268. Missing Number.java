// Solution 1 : Time = O(n) , Space = O(n)

class Solution {
    public int missingNumber(int[] nums) {
        int [] temp = new int[nums.length+1];
        for(int num: nums){
            temp[num] = 1;
        }
        for(int i = 0 ; i < temp.length ; i++){
            if(temp[i] == 0){
                return i;
            }
        }
        return -1;   
    }
}

// Solution 2 : Time = O(n) , Space = O(1)

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int num: nums){
            actualSum += num;
        }
        return expectedSum - actualSum;   
    }
}