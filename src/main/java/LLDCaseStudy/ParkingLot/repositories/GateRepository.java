package LLDCaseStudy.ParkingLot.repositories;

import LLDCaseStudy.ParkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private Map<Integer, Gate> gates;

    public GateRepository(){
        gates = new TreeMap<>();
    }

    public Optional<Gate> findById(int gateId){
        if(gates.containsKey(gateId)){
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}
