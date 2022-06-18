public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode fast = head , slow =head;
        
        while(fast.next != null&& fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                slow = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
        
    }
}
