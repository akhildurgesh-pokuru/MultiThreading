package Patterns.SingleTon.LazyInitialization;

public class Calculator {
    int a;
    int b;
    private static Calculator obj;

    Calculator(){
        System.out.println("Instanced Created");
    }

    public void sum(){
        System.out.println(a+b);
    }

    public static Calculator getInstance(){
        if(obj==null){
            synchronized (Calculator.class){
                if(obj==null){
                    obj =  new Calculator();
                }

            }
        }

        return obj;
    }
}
