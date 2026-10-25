package Patterns.FactoryandAbstract;

 class EmailNotification implements Notification {
    public void send(){
        System.out.println("Email Sent");
    }
 }
