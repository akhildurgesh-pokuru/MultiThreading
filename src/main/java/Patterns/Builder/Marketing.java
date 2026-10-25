package Patterns.Builder;

public class Marketing {
    public void marketingDetails(){

        UserBuilder builder = new UserBuilder();
        builder.setAge(20)
                .setCity("kadapa")
                .setName("akhil");

        User user = new User(builder);

        user.userDetails();
    }
}
