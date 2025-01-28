package inheritance;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("Mohit", "mohit.sharma@scaler.com", "pass");
        student.login("mohit.sharma@scaler.com", "pass");
        student.solveProblems();

        TA ta = new TA();
        ta.login("", "");
        ta.acceptHR();

        Instructor instructor = new Instructor();
        instructor.login("", "");
        instructor.takeClass();

        System.out.println();
//        WHENEVER WE CREATE AN OBJECT OF CHILD, PARENT CONSTRUCTOR IS ALSO CALLED

    }
}
