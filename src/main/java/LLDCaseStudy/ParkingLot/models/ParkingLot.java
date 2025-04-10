package LLDCaseStudy.ParkingLot.models;

import LLDCaseStudy.ParkingLot.strategies.SlotAllotcationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String name;
    private int totalCapacity;
    private List<ParkingFloor> parkingFloors;
    private String address;
    private List<Gate> gates;
    private SlotAllotcationStrategy slotAllotcationStrategy;
    // status

    public SlotAllotcationStrategy getSlotAllotcationStrategy() {
        return slotAllotcationStrategy;
    }

    public void setSlotAllotcationStrategy(SlotAllotcationStrategy slotAllotcationStrategy) {
        this.slotAllotcationStrategy = slotAllotcationStrategy;
    }
    // allowedVehicleTypes


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }
}
