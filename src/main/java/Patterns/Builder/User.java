package Patterns.Builder;

public class User {
    private String name;
    private int age;
    private double salary;
    private String city;

    User(UserBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.salary = builder.salary;
        this.city = builder.city;
    }

    public void userDetails(){
        System.out.print("Name: "+name);
        System.out.print(" Age: "+age);
        System.out.print(" City: "+city);
        System.out.print(" Salary: "+salary);
        System.out.println();
    }
}
