package DesignPatterns.Strategy;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hey Admin! What is the strategy you want to use today ?");
        String strategy = scanner.nextLine();

        SlotAllocationStrategy slotAllocationStrategy =
                SlotAllocationStrategyFactory.getSlotAllocationStrategy(strategy);
        ParkingLot parkingLot = new ParkingLot(slotAllocationStrategy);

        System.out.println(parkingLot.generateTicket());
    }
}
