class CircularList{
    Node head;

    CircularList(){
        head = null;
    }

    void insert_at_end(int data){
        Node newnode = new Node(data);
        if(head == null){
            head=newnode;
            head.next = head;
        }
        Node curr = head;
        while(curr.next!= head){
            curr = curr.next;
        }
        curr.next = newnode;
        newnode.next = head;

    }

    void display(){
        if(head ==null){
            System.out.println("LIst is empty");
            return;
        }

        Node temp = head;
        do{
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        while (temp !=head);
        System.out.println();
    }
} 