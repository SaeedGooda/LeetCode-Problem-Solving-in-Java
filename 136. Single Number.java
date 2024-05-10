// Solution 1 Using Map
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                result = entry.getKey();
                break; // Found the key, no need to continue iterating
            }
        }
        return result;
    }
}

// Solution 2 Using XOR Operator
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums){
            result ^= num;
        }
        return result;
    }
}