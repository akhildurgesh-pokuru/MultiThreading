package Patterns.Strategy;

public class Main {
    public static void main(String[] args){
        Notification email = new Email(new Aes(),new Gip());
        email.send();
        email.encrypt();

        Notification sms = new Sms(new Rsa(), new GGip());
        sms.send();
        sms.compress();
    }
}
