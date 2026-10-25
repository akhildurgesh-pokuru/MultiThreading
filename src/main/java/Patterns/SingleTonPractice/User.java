package Patterns.SingleTonPractice;

public class User {
    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            Company.getInstance().run();
        });
        Thread t2 = new Thread(()->{
            Company.getInstance().run();
        });

        t1.start();
        t2.start();

    }
}
