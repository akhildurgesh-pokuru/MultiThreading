package Patterns.Decorator;

class MargetorPizza implements Pizza{

    @Override
    public String description() {
        return "margetor pizza";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
