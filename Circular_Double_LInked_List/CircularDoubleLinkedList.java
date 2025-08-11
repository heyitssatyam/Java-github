
class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        next = prev = null;
    }
}

public class CircularDoubleLinkedList {
    Node head;
    Node tail;
    CircularDoubleLinkedList(){
        head  = tail = null;
    }
    void insert_at_begin(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            head.next = head;
            head.prev = head;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }
    void insert_at_end(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = tail = newnode;
            head.next = head;
            head.prev = head;
        }
        else{
            tail.next = newnode;
            head.prev = newnode;
            newnode.next = head;
            newnode.prev = tail;
            tail = newnode;
        }
    }

}
