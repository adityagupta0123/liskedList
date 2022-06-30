// t(O(nlogn)) s(0(1))
class Solution {
    public ListNode sortList(ListNode head) {
        if( head == null || head.next == null)
            return head;
        
        ListNode fast = head.next, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        fast = slow.next;
        slow.next = null;
        
        head = sortList(head);
        fast = sortList(fast);
        return merge(head, fast);
    }
     public ListNode merge(ListNode l1, ListNode l2) { // merge two sorted list
         if (l1 == null) return l2;
         if (l2 == null) return l1;
         
         if(l1.val <= l2.val){
             l1.next = merge(l1.next, l2);
             return l1;
         }
         else {
             l2.next = merge(l1, l2.next);
             return l2;
         }
//          ListNode dummy = new ListNode(-1);
//          ListNode head = dummy;
         
//          while(l1 != null && l2 != null){
//              if(l1.val < l2.val){
//                  ListNode node = new ListNode(l1.val);
//                  dummy.next = node;
//                  l1 = l1.next;
//              } else {
//                  ListNode node = new ListNode(l2.val);
//                  dummy.next = node;
//                  l2 = l2.next;
//              }
//              dummy = dummy.next;
//          }
//          if( l1 != null) dummy.next = l1;
//          if( l2 != null) dummy.next = l2;
//          return head.next;
     }
}
