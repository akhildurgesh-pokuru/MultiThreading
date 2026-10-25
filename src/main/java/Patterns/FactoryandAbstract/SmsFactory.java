package Patterns.FactoryandAbstract;

public class SmsFactory implements FactoryClass {
    public Notification notif(){
        return new SmsNotification();
    }

    @Override
    public Template temp() {
        return new SmsTemplate();
    }
}
