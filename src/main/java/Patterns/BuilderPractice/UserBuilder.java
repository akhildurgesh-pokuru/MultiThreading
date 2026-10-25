package Patterns.BuilderPractice;

public class UserBuilder {
    int id;
    String name;
    double salary;

    public UserBuilder setId(int id) {
        this.id = id;
        return this;
    }


    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }


    public UserBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }
}
