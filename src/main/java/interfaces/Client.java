package interfaces;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
//    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Dog d = new Dog();
        RoboticDog r = new RoboticDog();

        Cat cat = new Cat();

        List<Object> participants = new ArrayList<Object>();
        participants.add(d);
        participants.add(r);
        participants.add(cat);

        List<Runner> raceParticipants = new ArrayList<>();
        raceParticipants.add(d);
        raceParticipants.add(r);
//        raceParticipants.add(cat);


    }
}
