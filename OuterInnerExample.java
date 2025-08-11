public class OuterInnerExample {
    public static void main(String[] args){
        Outer outer = new Outer();

    outer.display();

    Outer.Inner inner = outer.new Inner();

    inner.display();
    }
}

class Outer{
    void display(){
        System.out.println("Hello from outer class");
    }

    class Inner{
        void display(){
            System.out.println("Hello from inner class");
        }
    }
}
