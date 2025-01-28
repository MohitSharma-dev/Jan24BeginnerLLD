package inheritance;

public class Student extends User{
    private double psp;

    Student(String name , String email, String password){
        System.out.println("Student Constructor is executed");
        setName(name);
        setEmail(email);
        setPassword(password);
        psp = 0.0;
    }

    public void solveProblems(){
        System.out.println("Student is solving problems");
    }
}
