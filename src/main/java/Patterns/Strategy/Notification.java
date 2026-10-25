package Patterns.Strategy;

public abstract class Notification {

    EncryptStrategy encryptStrategy;
    CompressStrategy compressStrategy;

    Notification(EncryptStrategy encryptStrategy, CompressStrategy compressStrategy){
        this.encryptStrategy = encryptStrategy;
        this.compressStrategy = compressStrategy;
    }

    abstract public void send();

    public void encrypt(){
        encryptStrategy.encrypt();
    }

    public void compress(){
        compressStrategy.compress();
    }
}
