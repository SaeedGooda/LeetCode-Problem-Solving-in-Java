class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = head;
        ListNode lowHead = new ListNode(0);
        ListNode low = lowHead;
        ListNode highHead = new ListNode(0);
        ListNode high = highHead;
        while(node != null){
            if(node.val < x){
                low.next = node;
                low = low.next;
            } else{
                high.next = node;
                high = high.next;
            }
            node = node.next;
        }
        // connection
        high.next = null;
        low.next = highHead.next;
        return lowHead.next;
    }
}