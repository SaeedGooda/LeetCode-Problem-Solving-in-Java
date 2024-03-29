/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode node = dummy;
        for(int i = 0 ; i < left - 1; i++){
            node = node.next;
        }
        ListNode connection = node.next;
        ListNode current = connection;
        ListNode prev = null;
        for(int i = left ; i <= right ; i++){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        node.next = prev;
        connection.next = current;
        return dummy.next;
    }
}