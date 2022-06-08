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
    }
    public void printList(){
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data+ "->");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        list.addFirst(1);
        list.printList();

    }
}
