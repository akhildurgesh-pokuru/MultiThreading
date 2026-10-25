package Patterns.Builder;

public class UserBuilder {
     String name;
     int age;
     double salary;
     String city;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public UserBuilder setCity(String city) {
        this.city = city;
        return this;
    }

}
