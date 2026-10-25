package Patterns.BuilderPractice;

public class Financial {
    public void finance(){
        UserBuilder builder = new UserBuilder();
        builder.setName("akhil")
                .setId(2421);


        User user = new User(builder);
        user.displayDetails();
    }

}
