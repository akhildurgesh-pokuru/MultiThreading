package Patterns.SingleTon.BasicImplementation;

public class Calculator {
    int a;
    int b;

    private static Calculator calculator = new Calculator();

    public int sum(){
        return a+b;
    }

    public static Calculator getInstance(){
        return calculator;
    }
}
