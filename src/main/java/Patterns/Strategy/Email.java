package Patterns.Strategy;

public class Email extends Notification{

    Email(EncryptStrategy encryptStrategy, CompressStrategy compressStrategy){
        super(encryptStrategy,compressStrategy);
    }

    public void send(){
        System.out.println("Email sent");
    }
}
