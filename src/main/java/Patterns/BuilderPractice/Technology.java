package Patterns.BuilderPractice;

public class Technology {
    public void tech(){
        UserBuilder builder = new UserBuilder();
        builder.setId(543)
                .setName("charan")
                .setSalary(125000.0);


        User user = new User(builder);
        user.displayDetails();
    }

}
