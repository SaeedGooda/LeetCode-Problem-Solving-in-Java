// Solution 1 - Time Complexity = O(n), Space = O(n)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode node = head;
        List<ListNode> list = new ArrayList<>();
        while(node != null){
            list.add(new ListNode(node.val));
            node = node.next;
        }
        list.remove(list.size()-n);
        for (int i = 0 ; i < list.size()-1 ; i++){
            list.get(i).next = list.get(i+1);
        }
        return list.isEmpty()? null: list.get(0);
    }
}

// Solution 2 - Time Complexity = O(n), Space = O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(0, head);
        ListNode first = result;
        ListNode second = result;
        for (int i = 0 ; i <= n ; i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return result.next;
    }
}

