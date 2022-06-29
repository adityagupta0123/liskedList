class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
       if( head == null || head.next == null || k == 0){
           return head;
       }       
        ListNode oh = null, ot = null;
        int len = length(head);
        
        ListNode cur = head;
        while( len >= k){
            int tempk = k ;
            while(tempk-- > 0){
                ListNode forw = cur.next;
                cur.next = null;
                addFristNode(cur);
                cur = forw;
            }
            if( oh == null){
                oh = th;
                ot = tt;
            } else {
                ot.next = th;
                ot = tt;
            }
            th = null;
            tt = null;
            len = len - k;
        }
        
        ot.next = cur;
        
        return oh;
    }
    public static int length(ListNode head){
        ListNode cur = head;
        int len = 0;
        while(cur != null){
           cur = cur.next;
           len++;
        }
        return len;
    }
    static ListNode th = null ,   tt = null;
    
    public static void addFristNode(ListNode head){
        if( th == null){
            th = head;
            tt = head;
        } else {
            head.next = th;
            th = head;
        }
    }
}
