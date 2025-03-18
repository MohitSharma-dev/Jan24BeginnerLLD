package DesignPatterns.Strategy;

public class RandomSlotAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public int allocateSlot() {
        return 5;
    }
}
