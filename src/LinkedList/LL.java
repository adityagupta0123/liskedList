package LinkedList;

public class LL {
    Node head ;
    private int size;
    LL(){
        size = 0;
    }
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        size++;
    }
    public void printList(){
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data+ "->");
            curNode = curNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node curNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            curNode = curNode.next;
            lastNode = lastNode.next;
        }
        curNode.next = null;
    }

    public  void getSize(){
        System.out.println("size of a list " + size);
    }

    public void reverseListIterative(){
        if( head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node curNode = head.next;
        while(curNode != null){
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

//    public void addInmid(int index, int data){
//        if(index > size && index< 0){
//            System.out.println("invalid index");
//            return;
//        }
//        size++;
//        Node newNode = new Node(data);
//        if(head == null || index == 0){
//            newNode.next = head;
//            head = newNode;
//            return;
//        }
//        Node curNode = head;
//        for (int i = 1; i < size ; i++) {
//            if(i == index){
//                Node nextNode = curNode.next;
//                curNode.next = nextNode;
//                newNode.next = nextNode;
//                break;
//            }
//            curNode = curNode.next;
//        }
//    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(2);
        list.addLast(3);
        list.addLast(5);
        list.printList();

        list.addFirst(1);
        list.printList();

//        list.addInmid(2, 4);
        list.printList();

        list.getSize();

        list.reverseListIterative();
        list.printList();

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();
    }
}
