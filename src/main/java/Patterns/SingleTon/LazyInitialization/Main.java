package Patterns.SingleTon.LazyInitialization;

public class Main {
    public static void main(String[] args){
//        Calculator calculator = Calculator.getInstance();
//        Calculator calculator1 = Calculator.getInstance();
//
//        calculator.b = 20;
//        calculator.a = 10;
//
//        calculator.sum();
//        calculator1.sum();

        Thread t1 = new Thread(()->{
            Calculator.getInstance();
        });
        Thread t2 = new Thread(()->{
            Calculator.getInstance();
        });

        t1.start();
        t2.start();
    }
}
