import java.io.IOException;

public class Threading {
    public static void main(String[] args) throws InterruptedException {
        task1 t1 = new task1();
        task2 t2 = new task2();
       // t1.setPriority(1);
        //t2.setPriority(10);
        t1.start();
        t1.sleep(5000);
        t2.start();

        t2.sleep(1000);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}

class task1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

class task2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
