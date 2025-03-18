package DesignPatterns.Strategy;

public class ParkingLot {
    private SlotAllocationStrategy slotAllocationStrategy;

    public ParkingLot(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public String generateTicket(){
        // allocate Slot
        int slot = slotAllocationStrategy.allocateSlot();
        return "TICKET-" + slot;
    }
}
