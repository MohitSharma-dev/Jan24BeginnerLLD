package DesignPatterns.Strategy;

public class NearestSlotAllocationStrategy implements SlotAllocationStrategy {
    @Override
    public int allocateSlot() {
        return 1;
    }
}
