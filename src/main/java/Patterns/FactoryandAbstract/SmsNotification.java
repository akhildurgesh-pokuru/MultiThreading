package Patterns.FactoryandAbstract;


 class SmsNotification implements Notification {
    public void send(){
        System.out.println("Sms Sent");
    }
 }
