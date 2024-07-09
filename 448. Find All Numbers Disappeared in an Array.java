class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean [] flags = new boolean[nums.length+1];
        for(int i = 0 ; i < nums.length; i++){
            flags[nums[i]] = true;
        }
        for(int i = 1 ; i < flags.length ; i++){
            if(!flags[i]){
                result.add(i);
            }
        }
        return result;
    }
}