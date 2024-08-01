/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxFreq = 0;
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        helper(root, map);
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;

    }
    public void helper(TreeNode node, Map<Integer, Integer> map){
        if(node == null){
            return;
        }
        int value = node.val;
        map.put(value, map.getOrDefault(value, 0) + 1);
        if(map.get(value) > maxFreq){
            maxFreq = map.get(value);
        }
        helper(node.left, map);
        helper(node.right, map);
    }
}