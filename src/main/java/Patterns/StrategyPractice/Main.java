package Patterns.StrategyPractice;

public class Main {
    public static void main(String[] args){
        Notification notification = new Gmail(new Aes(),new Gip());

        notification.send();
        notification.call();
    }
}
