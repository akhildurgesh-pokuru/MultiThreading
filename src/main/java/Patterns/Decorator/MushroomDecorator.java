package Patterns.Decorator;

public class MushroomDecorator extends PizzaDecorator{

    MushroomDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String description() {
        System.out.println(pizza.description()+ " with mushroom");
        return null;
    }

    @Override
    public int getCost() {
        System.out.println(pizza.getCost()+100);
        return 0;
    }
}
