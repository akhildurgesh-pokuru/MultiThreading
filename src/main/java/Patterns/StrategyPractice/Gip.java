package Patterns.StrategyPractice;

public class Gip implements CompressStrategy{

    @Override
    public void compress() {
        System.out.println("Gip Compressor");
    }
}
