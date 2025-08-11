public class ThreadConcurrentExample {
    public static void main(String[] args){
        MyThread mythread = new MyThread("Child Thread");

        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + "Count: "+ i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(Thread.currentThread().getName()+ "Thread INterrupted");
            }
        }
    }
}





class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + "Count:" + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(Thread.currentThread().getName() + "Thread Interrupted");
            }
        }
    }
}

