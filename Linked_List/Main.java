
 public class Main{
     public static void main(String [] args){
        LinkedList l1 = new LinkedList();
        l1.insert_at_start(10);
        l1.insert_at_start(20);
        l1.insert_at_start(30);
        l1.insert_at_start(40);
        l1.insert_at_start(40);
        l1.insert_at_start(40);
        l1.display();
        l1.reverse();
        // l1.delete_at_posi(2);
        l1.display();
        System.out.print(l1.count());
    }
}