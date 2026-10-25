package Patterns.Decorator;

public class CheeseDecorator extends PizzaDecorator {
    CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String description() {
        System.out.println(pizza.description() +" with cheese");
        return null;
    }

    @Override
    public int getCost() {
        System.out.println(pizza.getCost() + 50);
        return 0;
    }
}
