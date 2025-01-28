package copyConstructor;

public class Student {
    private int id;
    private int age;
    private double psp;
    private int gradYear;
    private Exam enrollmentExam;

    public Student() {}

    public Student(int id, int age, double psp, int gradYear) {
        this.id = id;
        this.age = age;
        this.psp = psp;
        this.gradYear = gradYear;
        this.enrollmentExam = new Exam(1 , 0);
    }

//    copy constructor
    Student(Student other){
        this.id = other.id;
        this.age = other.age;
        this.psp = other.psp;
        this.gradYear = other.gradYear;
//        copying the references : shallow copy
//        this.enrollmentExam = other.enrollmentExam;
        this.enrollmentExam = new Exam(other.enrollmentExam);
    }
}
