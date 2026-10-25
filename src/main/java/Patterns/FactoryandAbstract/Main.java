package Patterns.FactoryandAbstract;

public class Main {
    public static void main(String[] args){
        OrderService service = new OrderService();
        service.sendNotification("sms");
    }
}
