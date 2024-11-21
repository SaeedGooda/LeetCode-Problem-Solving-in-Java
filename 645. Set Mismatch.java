class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicated = -1, loss = -1;
        boolean[] flags = new boolean[nums.length + 1];

        for (int num : nums) {
            if (flags[num]) {
                duplicated = num;
            } else {
                flags[num] = true;
            }
        }

        for (int i = 1; i < flags.length; i++) {
            if (!flags[i]) {
                loss = i;
                break;
            }
        }

        return new int[]{duplicated, loss};
    }
}


// Solution 2

