package Generics;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Client {
    public static void main(String[] args) {
        PairOld pairOld = new PairOld();
        pairOld.setFirst("Mohit");
        pairOld.setSecond("Sharma");

        pairOld.setSecond(5);

        Pair<String , String> pair = new Pair<String, String>();
        pair.setFirst("Mohit");
        pair.setSecond("Sharma");

//        pair.setSecond(5);
        Pair<Double , Integer> metrics = new Pair<>();
        metrics.setFirst(5.0);
        metrics.setSecond(10);

        String temp = metrics.doSomething("Adas");
        metrics.<Integer>doSomething(5);
//        Collections : List,  HashMap, queue
//        Because of backward Compatibility , java allows to still use raw types
        Pair rawPair = new Pair();
//        automatically assume both types to be Object

        Animal animal = new Animal();
        animal.setName("Something");

        Animal animal2 = new Animal();
        animal2.setName("BigAnimal");

        Dog d = new Dog();
        d.setName("Dubby");

        Dog d2 = new Dog();
        d2.setName("Dog");

        Cat c = new Cat();
        c.setName("Catty");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(animal2);
        animals.add(c);
        animals.add(d);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(d);
        dogs.add(d2);

        AnimalUtility.printAnimalNames(animals);

        AnimalUtility.printAnimalNames(dogs);

//        Map
    }
}
