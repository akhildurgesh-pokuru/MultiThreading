package Patterns.StrategyPractice;

public class Gmail extends Notification{

    Gmail(EncryptStrategy encryptStrategy, CompressStrategy compressStrategy){
        super(encryptStrategy,compressStrategy);
    }


    @Override
    public void send() {
        System.out.println("email sent");
    }
}
