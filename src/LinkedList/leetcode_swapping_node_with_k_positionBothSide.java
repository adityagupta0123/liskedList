class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head, slow = head, n1 = head;
        
        for(int i=0; i< k-1; i++){
            fast = fast.next;
            n1 = fast;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int n1val = n1.val;
        n1.val = slow.val;
        slow.val = n1val;
        
        return head;
        
    }
}
