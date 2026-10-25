package Patterns.Adapter;

public class PaypalGateway implements PaymentService{

//    PaypalGateway paypalGateway;
//    PaypalGateway(PaypalGateway paypalGateway){
//        this.paypalGateway = paypalGateway;
//    }

    @Override
    public String pay(int cust_id, double amount) {
        return "success";
    }
}
