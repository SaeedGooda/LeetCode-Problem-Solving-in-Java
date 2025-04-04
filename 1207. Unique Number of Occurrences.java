class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int element: arr){
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}