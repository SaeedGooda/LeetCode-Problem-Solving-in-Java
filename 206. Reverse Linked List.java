class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode previous = null;
        ListNode current = head;
        while(current != null){
            ListNode nextCurrent = current.next;
            current.next = previous;
            previous = current;
            current = nextCurrent;
        }
        return previous;
    }
}