package Patterns.Strategy;

public class Push extends Notification{

    Push(EncryptStrategy encryptStrategy, CompressStrategy compressStrategy){
        super(encryptStrategy,compressStrategy);
    }

    @Override
    public void send() {
        System.out.println("Push sent");
    }
}
