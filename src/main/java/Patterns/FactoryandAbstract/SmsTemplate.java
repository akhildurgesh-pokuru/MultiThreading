package Patterns.FactoryandAbstract;

public class SmsTemplate implements Template {
    @Override
    public void format() {
        System.out.println("Sent Sms Template");
    }
}
