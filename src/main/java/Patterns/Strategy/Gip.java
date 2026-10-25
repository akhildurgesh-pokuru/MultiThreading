package Patterns.Strategy;

public class Gip implements CompressStrategy{
    @Override
    public void compress() {
        System.out.println("GIP Strategy");
    }
}
