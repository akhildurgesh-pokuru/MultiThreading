package Patterns.FactoryandAbstract;

public class EmailFactory implements FactoryClass{
    public Notification notif(){
        return new EmailNotification();
    }

    public Template temp() {
        return new EmailTemplate();
    }
}
