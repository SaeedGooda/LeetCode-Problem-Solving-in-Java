/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length);
    }
    public Node construct(int[][] grid, int x , int y, int length){
        if(check(grid, x, y, length)){
            return new Node(grid[x][y] == 1, true);
        }
        int half = length / 2;
        Node topLeft = construct(grid, x, y, half);
        Node topRight = construct(grid, x, y + half, half);
        Node bottomLeft = construct(grid, x + half, y, half);
        Node bottomRight = construct(grid, x + half, y + half, half);
        return new Node(grid[x][y] == 1 , false, topLeft, topRight, bottomLeft, bottomRight);
    }
    private boolean check(int[][] grid, int x, int y, int length){
        for(int i = x ; i < x + length ; i++){
            for(int j = y ; j < y + length ; j++){
                if(grid[i][j] != grid[x][y]){
                    return false;
                }
            }
        }
        return true;
    }
}