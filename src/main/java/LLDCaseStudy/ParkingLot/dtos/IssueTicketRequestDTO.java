package LLDCaseStudy.ParkingLot.dtos;

import LLDCaseStudy.ParkingLot.models.VehicleType;

public class IssueTicketRequestDTO {
    private String licensePlate;
    private String ownerName;
    private int gateId;
    private VehicleType vehicleType;

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
