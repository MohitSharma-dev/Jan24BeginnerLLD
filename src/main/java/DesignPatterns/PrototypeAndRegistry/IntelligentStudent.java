package DesignPatterns.PrototypeAndRegistry;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(){}

    // to actually copy
    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    // manage the copying process
    public IntelligentStudent copy(){
        IntelligentStudent copy = new IntelligentStudent(this);
        return copy;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
