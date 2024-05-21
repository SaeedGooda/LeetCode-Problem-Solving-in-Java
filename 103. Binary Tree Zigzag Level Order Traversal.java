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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelNodes = new ArrayList<>();
            for(int i = 0 ; i < size ; i++){
                TreeNode node = queue.remove();
                if(level % 2 == 0){
                    levelNodes.add(0, node.val);
                } else{
                    levelNodes.add(node.val);
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            list.add(levelNodes);
            level++;
        }
        return list;
    }
}