package Patterns.BuilderPractice;

public class User {
    private int id;
    private String name;
    private double salary;

    User(UserBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.salary = builder.salary;
    }

    public void displayDetails(){
        System.out.print("Id: "+id);
        System.out.print(" Name: "+name);
        System.out.print(" Salary: "+salary);
        System.out.println();
    }
}
