package abstractClasses;

public abstract class Animal {
    private String name;
    private int age;

    public void walk(){
        System.out.println("Animal is walking");
    }

//    Everyone under me should know how to eat
    public abstract void eat();
}

// Interfaces ?

// reason 1 : You can't inherit multiple classes
// reason 2 : Abstract classes can have attributes and method definitions for children
// reason 3 : Entities => class , Behaviours => Interface