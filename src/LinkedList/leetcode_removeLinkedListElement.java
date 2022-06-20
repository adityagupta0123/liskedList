class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        if(head.val == val)
             return removeElements(head.next,val);
        ListNode nextNode = head;
        while(nextNode != null && nextNode.next != null ){
            if(nextNode.next.val == val)
                nextNode.next = nextNode.next.next;
            else
                nextNode = nextNode.next;
        }
        return head;
    }
}
