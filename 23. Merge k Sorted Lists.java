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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;

        Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (final ListNode list : lists)
            if (list != null){
                minHeap.offer(list);
            }

            while (!minHeap.isEmpty()) {
                ListNode minNode = minHeap.poll();
                if (minNode.next != null){
                    minHeap.offer(minNode.next);
                }
                result.next = minNode;
                result = result.next;
            }
        return dummy.next;
    }
}