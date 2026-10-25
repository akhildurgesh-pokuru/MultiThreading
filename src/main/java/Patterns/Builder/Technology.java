package Patterns.Builder;

public class Technology {
    public void technologyDetails(){
        UserBuilder builder = new UserBuilder();
        builder.setName("akhil")
                .setAge(20)
                .setCity("kadapa");

        User user = new User(builder);
        user.userDetails();
    }

}
