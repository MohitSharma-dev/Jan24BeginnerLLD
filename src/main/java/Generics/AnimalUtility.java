package Generics;

import java.util.List;

public class AnimalUtility {
//    public static void printAnimalNames(List<Animal> animals){
//        for(Animal animal : animals){
//            System.out.println(animal.getName());
//        }
//    }

    public static <T extends Animal> void printAnimalNames(List<T> animals){
        for (T someAnimal : animals) {
            System.out.println(someAnimal.getName());
//            someAnimal.bark();
        }
    }
//    ? => Anything
    public static void printAnimal(List<? extends  Animal> animals){
        for(Animal animal : animals){
            System.out.println(animal.getName());
        }
    }
}
