package DesignPatterns.PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {

        Student s = new Student();
        IntelligentStudent i = new IntelligentStudent();

        Student t = s.copy();
        Student t1 = i.copy();

        System.out.println();

        StudentRegistry studentRegistry = new StudentRegistry();
        s.setAge(25);
        s.setName("New Student");
        s.setBatch("Apr24");

        studentRegistry.add("Apr24Student", s);

        Student st = studentRegistry.get("Apr24Student").copy();
    }
}
