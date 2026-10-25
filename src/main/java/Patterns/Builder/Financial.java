package Patterns.Builder;

public class Financial {
    public void financialDetails(){

        UserBuilder builder = new UserBuilder();
        builder.
                setName("Akhil")
                .setAge(20)
                .setSalary(25000)
                .setCity("kadapa");

        User user  = new User(builder);
        user.userDetails();
    }
}
