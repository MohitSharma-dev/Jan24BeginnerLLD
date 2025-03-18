package DesignPatterns.Strategy;

public class FarthestSlotAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public int allocateSlot() {
        return 50;
    }
}
