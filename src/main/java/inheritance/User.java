package inheritance;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public User() {
        System.out.println("User's constructor is executed");
    }

    public void login(
            String email, String password
    ){
        if(email.equals(this.email) && password.equals(this.password)){
            System.out.println("Login successful");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
