package Patterns.Strategy;

public class Rsa implements EncryptStrategy{
    @Override
    public void encrypt() {
        System.out.println("RSA strategy");
    }
}
