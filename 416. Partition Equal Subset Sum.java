class Solution {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length < 2) return false;

        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;

        Map<String, Boolean> map = new HashMap<>();
        return dfs(nums, 0, sum / 2, map);
    }

    public boolean dfs(int[] nums, int index, int target, Map<String, Boolean> map) {
        if (target == 0) return true;
        if (target < 0 || index >= nums.length) return false;

        String key = index + "," + target;
        if (map.containsKey(key)) return map.get(key);

        if (dfs(nums, index + 1, target - nums[index], map)) {
            map.put(key, true);
            return true;
        }

        if (dfs(nums, index + 1, target, map)) {
            map.put(key, true);
            return true;
        }

        map.put(key, false);
        return false;
    }
}