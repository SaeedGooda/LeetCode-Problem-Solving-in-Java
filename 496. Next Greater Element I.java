// Solution 1

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int i = 0 ; i < nums1.length ; i++){
            result[i] = getGreaterElement(nums2, nums1[i]);
        }
        return result;
    }
    public int getGreaterElement(int [] arr, int element){
        boolean flag = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(flag && arr[i] > element){
                return arr[i];
            }
            if(arr[i] == element){
                flag = true;
            }
        }
        return -1;
    }
}

// Solution 2

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}