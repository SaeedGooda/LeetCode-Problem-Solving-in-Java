class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode result = new ListNode(0, head);
        ListNode previous = result;
        ListNode current = result.next;
        while(current != null){
            while(current.next != null && current.val == current.next.val){
                current = current.next;
            }
            if(previous.next == current){
                previous = previous.next;
            } else{
                previous.next = current.next;
            }
            current = current.next;
        }
        return result.next;
    }
}