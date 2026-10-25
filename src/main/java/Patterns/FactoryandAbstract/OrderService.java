package Patterns.FactoryandAbstract;

public class OrderService {
    public void sendNotification(String type){
        FactoryClass factory = new SmsFactory();
        Notification sms = factory.notif();
        sms.send();

        FactoryClass factory1 = new EmailFactory();
        Template email = factory1.temp();
        email.format();
    }
}
