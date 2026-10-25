package Patterns.Strategy;

public class GGip implements CompressStrategy{
    @Override
    public void compress() {
        System.out.println("GGip Strategy");
    }
}
