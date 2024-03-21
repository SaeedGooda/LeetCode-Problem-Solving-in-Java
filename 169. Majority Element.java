import java.util.HashMap;

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
