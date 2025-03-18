package DesignPatterns.Strategy;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy getSlotAllocationStrategy(String strategy) {
        SlotAllocationStrategy slotAllocationStrategy = null;
        if(strategy.equalsIgnoreCase("Farthest")) {
            slotAllocationStrategy = new FarthestSlotAllocationStrategy();
        } else if(strategy.equalsIgnoreCase("Nearest")) {
            slotAllocationStrategy = new NearestSlotAllocationStrategy();
        } else {
            slotAllocationStrategy = new RandomSlotAllocationStrategy();
        }
        return slotAllocationStrategy;
    }
}
