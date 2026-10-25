public class Synchronization {
    public static void main(String[] args){
        dummy1  dummy = new dummy1();

        Thread t1 = new Thread(()->dummy.run());
        Thread t2 = new Thread(()->dummy.run());

        t1.start();
        t2.start();

    }
}


class dummy1 extends Thread{
    int x =10;

    public synchronized void run(){
        synchronized (dummy1.class){
            x+=50;
        }
        System.out.println(Thread.currentThread().getName()+" "+x);
    }
}

