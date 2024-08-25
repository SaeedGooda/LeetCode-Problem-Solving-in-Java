class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, result, target, 0, 0, new ArrayList<>());
        return result;
    }
    private void backtrack(int[] candidates, List<List<Integer>> result, int target, int sum, int index, ArrayList<Integer> temp){
        if(sum == target){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index ; i < candidates.length ; i++){
            if(sum + candidates[i] <= target){
                temp.add(candidates[i]);
                backtrack(candidates, result, target, sum+candidates[i], i , temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}