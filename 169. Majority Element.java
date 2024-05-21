// Solution 1 - Time = O(n) , Space = O(n)
class Solution {

    public int majorityElement(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element: nums){
            if(map.containsKey(element)){
                map.put(element, map.get(element)+1);
            } else{
                map.put(element, 1);
            }
            if(map.get(element) > nums.length/2){
                result = element;
            }
        }
        return result;
    }

}

// Solution 2 - Time = O(n) , Space = O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        int count = 0;
        for(int element: nums){
            if(count == 0){
                result = element;
            }
            count += (element == result) ? 1 : -1; 
        }
        return result;
    }
}