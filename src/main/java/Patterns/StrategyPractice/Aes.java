package Patterns.StrategyPractice;

public class Aes implements EncryptStrategy{

    @Override
    public void encrypt() {
        System.out.println("Aes Strategy");
    }
}
