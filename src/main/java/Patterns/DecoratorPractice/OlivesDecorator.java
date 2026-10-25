package Patterns.DecoratorPractice;

public class OlivesDecorator extends PizzaDecorator{

    OlivesDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String description() {
        pizza.description();
        return null;
    }

    @Override
    public double getCost() {
        return 0;
    }
}
