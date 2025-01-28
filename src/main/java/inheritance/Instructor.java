package inheritance;

public class Instructor extends User{
    private String subject;

    public void takeClass(){
        System.out.println("Instructor is taking the class");
    }
}
