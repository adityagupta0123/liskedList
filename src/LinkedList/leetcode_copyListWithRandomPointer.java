class Solution {
     public Node copyRandomList(Node head) {
//         HashMap<Node, Node> map = new HashMap<>();
//         Node cur = head;
//         Node nHead = new Node(-1);
//         Node prev = nHead;
        
//         while(cur != null){
//             Node node = new Node(cur.val);
            
//             prev.next = node;
//             map.put(cur, node);
            
//             prev = prev.next;
//             cur = cur.next;
           
//         }
         
//         nHead = nHead.next;
//         Node c1 = head;
//         Node c2 = nHead;
        
//         while(c1 != null){
//             c2.random = (c1.random != null ? map.get(c1.random) : null);
//             c1 = c1.next;
//             c2 = c2.next;
//         }
        
//         return nHead;
        
        copyList(head);
        copyRandomPointer(head);
        return extractDeepCopy(head);
    }
    public static void copyList(Node head){
        Node cur = head;
        while(cur != null){
            Node node = new Node(cur.val);
            Node forw = cur.next;
            cur.next = node;
            node.next = forw;
            
            cur = forw;
        }
    }
    public static void copyRandomPointer(Node head){
        Node cur = head;
        while(cur != null){
            Node random = cur.random;
            if(random != null)
                cur.next.random = random.next;
            
            cur = cur.next.next;
        }
    }
    public static Node extractDeepCopy(Node head){
        Node dummy  = new Node(-1);
        Node prev = dummy ,  cur = head;
        
        while(cur != null ){
            prev.next = cur.next;
            cur.next = cur.next.next;
            
            prev = prev.next;
            cur = cur.next;
        }
        return dummy.next;
    }
    
    
    
    
}
