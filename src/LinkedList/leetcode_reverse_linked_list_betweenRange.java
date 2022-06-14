class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode leftprev = dummy, cur = head;
        for(int i =0; i< left -1; i++){
            leftprev = cur;
            cur = cur.next;
        }
        ListNode prev = null;
        for(int i=0; i< right - left + 1; i++){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        leftprev.next.next = cur;
        leftprev.next = prev;
        
        return dummy.next;        
            
    }
}
