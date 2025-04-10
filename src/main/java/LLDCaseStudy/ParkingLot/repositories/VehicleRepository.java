package LLDCaseStudy.ParkingLot.repositories;

import LLDCaseStudy.ParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    private Map<String, Vehicle> vehicles;
    private static int counter = 0;

    public VehicleRepository(){
        vehicles = new TreeMap<>();
    }

    public Optional<Vehicle> findByLicensePlate(String licensePlate){
        return Optional.ofNullable(vehicles.get(licensePlate));
    }

    public Vehicle save(Vehicle vehicle){
        counter++;
        vehicle.setId(counter);
        vehicles.put(vehicle.getLicensePlate(), vehicle);
        return vehicle;
    }
}
