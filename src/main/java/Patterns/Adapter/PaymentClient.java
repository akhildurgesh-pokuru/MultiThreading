package Patterns.Adapter;

public class PaymentClient {
    PaymentService paymentService;

    PaymentClient(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void pay(int cust_id, double amount){
        String result = paymentService.pay(cust_id,amount);
        if(result.equals("success")){
            System.out.println("Payment Successfull");
        }else{
            System.out.println("Payment Unsuccessfull");
        }
    }
}
