import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static List<List<Integer>> threeSum(int [] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3){
            return result;
        }
        Arrays.sort(nums); // sort array
        for(int i = 0 ; i < nums.length - 2 ; i++){
            // skip duplicates
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            // the idea is to get two elements that equal target, target = -third element
            // all elements will be = 0
            int j = i+1;
            int k = nums.length-1;
            int target = -nums[i];
            while(j < k){
                // skip duplicates
                if(j > i+1 && nums[j] == nums[j-1]){
                    j++;
                    continue;
                }
                // skip duplicates
                if(k < nums.length-1 && nums[k] == nums[k+1]){
                    k--;
                    continue;
                }
                int sum = nums[j] + nums[k];
                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum > target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return result;
    }

}
