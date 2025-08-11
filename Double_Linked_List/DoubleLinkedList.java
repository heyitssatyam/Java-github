

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        prev = next = null;
    }
}


class DoubleLinkedList{
    Node head;
    Node tail;

    DoubleLinkedList(){
        head = tail = null;
    }

    void insert_at_start(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = tail = newnode;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }
    void insert_at_end(int data){
        Node newnode = new Node(data);
        if(head == null && tail ==null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            
        }
    }

    void insert_at_posi(int data,int position){
        Node newnode = new Node(data);

        if(position == 1){
            insert_at_start(data);
            return;
        }
        int count=0;
        Node curr = head;
        while(curr!=null && count<position -1){
            curr=curr.next;
            count++;
        }
         if(curr==null){
            System.out.println("Position out of bound");
            return;
        }
        newnode.next =curr.next;
        newnode.next.prev = curr;
        curr.next = newnode;
        newnode.prev= curr;

    }

    void display(){
        Node curr = head;
        if(head == null){
            System.out.println("Double Linked List is empty");
        }
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr= curr.next;
        }
    }

    void displayReverse(){
        Node curr = tail;
        if(tail== null){
            System.out.println("Double Linked List is empty");
        }
        while(curr!=  null){
            System.out.print(curr.data + " " );
            curr = curr.prev; 
        }

    }
}
