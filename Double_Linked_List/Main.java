

class Main{
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insert_at_start(10);
        dll.insert_at_start(20);
        dll.insert_at_start(30);
        dll.insert_at_posi(35, 1);
        dll.display();
    }
}