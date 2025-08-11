public class RunnableThreadExample {
    public static void main(String[] args){
        MyRunnable myrunnable1= new MyRunnable();
        MyRunnable myrunnable2= new MyRunnable();
        MyRunnable myrunnable3= new MyRunnable();
        MyRunnable myrunnable4= new MyRunnable();
        MyRunnable myrunnable5= new MyRunnable();

        Thread thread1= new Thread(myrunnable1);
        Thread thread2= new Thread(myrunnable2);
        Thread thread3= new Thread(myrunnable3);
        Thread thread4= new Thread(myrunnable4);
        Thread thread5= new Thread(myrunnable5);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        myrunnable1.stopThread();
        myrunnable2.stopThread();
        myrunnable3.stopThread();
        myrunnable4.stopThread();
        myrunnable5.stopThread();
    }    
}


class MyRunnable implements Runnable{
    private volatile boolean running = true;

    public void run(){
        while(running){
            try{
                Thread.sleep(500);
                System.out.println("Thread ID:" + Thread.currentThread().getId() + "is running");
            }catch(InterruptedException e){
                System.out.println("Interruption occured");
            }
        }
    }
    public void stopThread(){
        running = false;
    }
}



