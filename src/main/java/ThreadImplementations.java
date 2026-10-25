public class ThreadImplementations {
    public static void main(String[] args) throws InterruptedException {
        dummy t1 = new dummy();
        extra t2 = new extra();

        t1.start();
        t1.join();
        t1.sleep(5000);
        t2.start();
    }
}

class dummy extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+ " "+i);
        }
    }
}

class extra extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+ " "+i);
        }
    }
}
