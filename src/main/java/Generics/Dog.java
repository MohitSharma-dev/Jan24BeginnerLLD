package Generics;

public class Dog extends Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark(){
        System.out.println("Barking");
    }
}
