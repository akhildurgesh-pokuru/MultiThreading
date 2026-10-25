package Patterns.StrategyPractice;

public class Sms extends Notification{

    Sms(EncryptStrategy encryptStrategy, CompressStrategy compressStrategy){
        super(encryptStrategy,compressStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sms sent");
    }
}
