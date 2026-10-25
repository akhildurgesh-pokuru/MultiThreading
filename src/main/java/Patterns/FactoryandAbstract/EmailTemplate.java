package Patterns.FactoryandAbstract;

public class EmailTemplate implements Template{
    public void format(){
        System.out.println("Sent email format");
    }
}
