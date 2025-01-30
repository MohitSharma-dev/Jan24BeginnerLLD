package abstractClasses;

public class Cat extends Animal {
    public String type;

    public void meow(){
        System.out.println("Cat is meowing");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
