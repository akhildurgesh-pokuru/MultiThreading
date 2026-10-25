package Patterns.Decorator;

public class Main {
    public static void main(String[] args){
        MargetorPizza pizza = new MargetorPizza();
        CheeseDecorator cheesepizza = new CheeseDecorator(pizza);
        cheesepizza.description();
        cheesepizza.getCost();
    }
}
