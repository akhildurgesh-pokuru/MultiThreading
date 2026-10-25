package Patterns.BuilderPractice;

public class Marketing {
    public void market(){
        UserBuilder builder = new UserBuilder();
        builder.setId(2342);

        User user = new User(builder);
        user.displayDetails();
    }

}
