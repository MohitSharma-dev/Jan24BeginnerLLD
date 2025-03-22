package DesignPatterns.PrototypeAndRegistry;

public class Student {
    private String name;
    private int age;
    private String batch;

    public Student() {
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
    }

    public Student copy(){
        Student student = new Student(this);
        return student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
