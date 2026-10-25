package Patterns.Adapter;

public class Main {
    public static void main(String[] args){
        PaymentService service = new PaypalGateway();
        PaymentClient client = new PaymentClient(service);
        client.pay(14232,34000);
    }
}
