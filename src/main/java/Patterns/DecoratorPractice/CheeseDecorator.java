package Patterns.DecoratorPractice;

public class CheeseDecorator extends PizzaDecorator{

    CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String description() {
    System.out.println(pizza.description());
        return null;
    }

    @Override
    public double getCost() {
        pizza.getCost();
        return 0;
    }
}
