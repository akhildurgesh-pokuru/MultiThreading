package Patterns.Decorator;

public class OlivesDecorator extends PizzaDecorator{

    OlivesDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String description() {
        System.out.println(pizza.description()+ " with olives");
        return null;
    }

    @Override
    public int getCost() {
        System.out.println(pizza.getCost()+150);
        return 0;
    }
}
