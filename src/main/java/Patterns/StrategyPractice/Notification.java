package Patterns.StrategyPractice;

abstract class Notification {

    EncryptStrategy encryptStrategy;
    CompressStrategy compressStrategy;

    Notification(EncryptStrategy encryptStrategy, CompressStrategy compressStrategy){
        this.compressStrategy = compressStrategy;
        this.encryptStrategy = encryptStrategy;
    }

    public abstract void send();

    public void call(){
        encryptStrategy.encrypt();
        compressStrategy.compress();
    }
}
