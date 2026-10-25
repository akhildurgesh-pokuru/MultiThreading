public class ImplementingRunnable {
    public static void main(String[] args) throws InterruptedException{
        runs run = new runs();
        speed s = new speed();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(s);

        t1.start();
        t1.join();
        t2.start();
    }
}

class runs implements Runnable{

    @Override
    public void run() {
        for(int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

class speed implements Runnable{

    @Override
    public void run() {
        for(int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
