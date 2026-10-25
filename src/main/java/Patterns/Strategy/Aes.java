package Patterns.Strategy;

public class Aes implements EncryptStrategy{

    @Override
    public void encrypt() {
        System.out.println("AES Strategy");
    }
}
