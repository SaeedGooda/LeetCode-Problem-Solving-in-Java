class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        // get length of the list
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        // update k
        k = k % length;
        // rotate for k times
        for(int i = 0 ; i < k ; i++){
            ListNode previous = head;
            ListNode current = head.next;
            while(current.next != null){
                current = current.next;
                previous = previous.next;
            }
            current.next = head;
            previous.next = null;
            head = current;
        }
        return head;
    }
}