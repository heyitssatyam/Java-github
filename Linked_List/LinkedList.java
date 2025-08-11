 class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    
}

public class LinkedList{
    Node head;
    LinkedList (){
    this.head = null;
    }

    void insert_at_end(int data){
        Node newNode = new Node(data);
        if( head == null){
            head = newNode;
        }
        else{
            Node curr = head;
            while(curr.next !=null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    void insert_at_start(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current !=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    void insert_at_pos(int data, int position){
        Node newnode = new Node(data);
        if(position ==0){
            newnode.next = head;
            head = newnode;
            return;
        }
        Node curr=head;
        int count =0;
        while(curr!=null && count<position-1){
            curr=curr.next;
            count++;
        }
        if(curr==null){
            System.out.println("Position out of bound");
            return;
        }
        newnode.next=curr.next;
        curr.next = newnode;
    }

    void delete_at_beg(){
        if(head ==null){
            System.out.println("List is empty. Nothing to delete");
            return;
        }
        head= head.next;
    }

    void delete_at_end(){
        if(head == null){
            System.out.println("List is empty. Nothing to delete");
        }
        if(head.next == null){
            head=null;
            return;
        }
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next= null;
    }

    void delete_at_posi(int position){
        if(position == 0){
            head = head.next;
            return;
        }
        int count = 0;
        Node curr = head;
        while(curr!=null && count < position-1){
            curr=curr.next;
            count++;
        }
        curr.next = curr.next.next;

    }
    int count(){
        Node curr = head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    void display() {
        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            Node curr = head;
            while(curr!=null){
                System.out.print(curr.data + " ");
                curr=curr.next;
            }
        System.out.println();
        }
        
    }
}

