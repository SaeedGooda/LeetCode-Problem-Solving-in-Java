class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), n, k , 1);
        return result;
    }
    public void backtrack(List<List<Integer>> result, ArrayList<Integer> temp, int n , int k , int start){
        if(temp.size() == k){
            result.add(new ArrayList<>(temp));
        }
        for(int i = start ; i <= n ; i++){
            temp.add(i);
            backtrack(result, temp, n, k, ++start);
            temp.remove(temp.size()-1);
        }
    }
}