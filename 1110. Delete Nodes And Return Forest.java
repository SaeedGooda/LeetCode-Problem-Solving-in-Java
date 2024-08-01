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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> forest = new ArrayList<>();
        Set<Integer> toDeleteSet = new HashSet<>();
        for(int element: to_delete){
            toDeleteSet.add(element);
        }
        root = helper(root, toDeleteSet, forest);
        if(root != null){
            forest.add(root);
        }
        return forest;
    }
    private TreeNode helper(TreeNode node, Set<Integer> toDeleteSet, List<TreeNode> forest){
        if(node == null){
            return null;
        }
        node.left = helper(node.left, toDeleteSet, forest);
        node.right = helper(node.right, toDeleteSet, forest);

        if(toDeleteSet.contains(node.val)){
            if(node.left != null){
                forest.add(node.left);
            }
            if(node.right != null){
                forest.add(node.right);
            }
            return null;
        }
        return node;
    }
}