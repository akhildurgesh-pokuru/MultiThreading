package Patterns.DecoratorPractice;

public class ItalianPizza implements Pizza{
    @Override
    public String description() {
        return "Italian Pizza";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
