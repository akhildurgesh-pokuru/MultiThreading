package Patterns.SingleTon.BasicImplementation;

public class Main {
    public static void main(String[] args){
        Calculator calculator = Calculator.getInstance();
        calculator.a = 10;
        calculator.b = 20;
        int sum = calculator.sum();
        System.out.println("Sum: "+sum);
    }
}
