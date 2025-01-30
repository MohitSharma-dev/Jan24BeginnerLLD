package abstractClasses;

public class Dog extends Animal {
    private String cutenessLevel;

    public void bark(){
        System.out.println("Bhau Bhau!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
