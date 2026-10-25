package Patterns.DecoratorPractice;

public class Main {
    public static void main(String[] args){
        ItalianPizza pizza = new ItalianPizza();
        CheeseDecorator cheese = new CheeseDecorator(pizza);
        cheese.description();
        cheese.getCost();

    }
}
