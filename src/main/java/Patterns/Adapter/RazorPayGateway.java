package Patterns.Adapter;

public class RazorPayGateway implements PaymentService{

//    RazorPayGateway razorPayGateway;
//    RazorPayGateway(RazorPayGateway razorPayGateway){
//        this.razorPayGateway = razorPayGateway;
//    }

    @Override
    public String pay(int cust_id, double amount) {
        return "success";
    }
}
