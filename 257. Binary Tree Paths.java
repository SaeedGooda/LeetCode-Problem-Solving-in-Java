class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, "", result);
        return result;
    }
    private void dfs(TreeNode node, String s, List<String> result){
        if(node == null) return;
        s += String.valueOf(node.val);
        if(node.left == null && node.right == null){
            result.add(s);
            return;
        }
        dfs(node.left, s + "->", result);
        dfs(node.right, s + "->", result);
    }
}