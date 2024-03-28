/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> nodes = new HashMap<>();
        Node n = head;
        while(n != null){
            Node newNode = new Node(n.val);
            nodes.put(n, newNode);
            n = n.next;
        }
        n = head;
        while(n != null){
            Node copied = nodes.get(n);
            copied.next = nodes.get(n.next);
            copied.random = nodes.get(n.random);
            n = n.next;
        }
        return nodes.get(head);
    }
}