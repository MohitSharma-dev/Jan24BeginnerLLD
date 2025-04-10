package LLDCaseStudy.ParkingLot.strategies;


import LLDCaseStudy.ParkingLot.models.*;

public class RandomSlotAllocationStrategy implements SlotAllotcationStrategy {
    @Override
    public ParkingSlot allotSlot(ParkingLot parkingLot , VehicleType vehicleType) {
        for(ParkingFloor pf : parkingLot.getParkingFloors()) {
            for(ParkingSlot parkingSlot : pf.getParkingSlots()) {
                if(parkingSlot.getSlotStatus().equals(ParkingSlotStatus.EMPTY) && parkingSlot.getAllowedVehicleType().equals(vehicleType)) {
                    return parkingSlot;
                }
            }
        }
        return null;
    }
}
