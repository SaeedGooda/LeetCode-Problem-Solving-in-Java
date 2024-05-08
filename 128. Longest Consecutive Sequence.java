class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int max = Integer.MIN_VALUE;
        for(int num: set){
            if(!set.contains(num - 1)){
                int length = 0;
                while(set.contains(num+length)){
                    length++;
                }
                max = Math.max(max, length);
            }
        }
        return max;
    }
}