package LLDCaseStudy.ParkingLot.services;

import LLDCaseStudy.ParkingLot.models.*;
import LLDCaseStudy.ParkingLot.repositories.GateRepository;
import LLDCaseStudy.ParkingLot.repositories.ParkingLotRepository;
import LLDCaseStudy.ParkingLot.repositories.TicketRepository;
import LLDCaseStudy.ParkingLot.repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository,
            TicketRepository ticketRepository
    ) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }
    public Ticket issueTicket(
            String licensePlate,
            String ownerName,
            int gateId,
            VehicleType vehicleType,
            int parkingLotId
    ){
        // 1. get the Gate object using gateId
        Optional<Gate> gateOptional = gateRepository.findById(gateId);
        if(gateOptional.isEmpty()){
            throw new RuntimeException("No such Gate exists");
        }
        Gate gate = gateOptional.get();

        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findById(parkingLotId);
        if(parkingLotOptional.isEmpty()){
            throw new RuntimeException("No such parking lot exists");
        }
        ParkingLot parkingLot = parkingLotOptional.get();

        // 2. Get the vehicle from db if present
        Optional<Vehicle> vehicleOptional = vehicleRepository.findByLicensePlate(licensePlate);
        Vehicle vehicle = null;
        if(vehicleOptional.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setLicensePlate(licensePlate);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            // save to db
            vehicleRepository.save(vehicle);
        } else {
            vehicle = vehicleOptional.get();
        }

        // 3. Get the slot
        ParkingSlot parkingSlot =
                parkingLot
                .getSlotAllotcationStrategy()
                .allotSlot(parkingLot, vehicleType);

        if(parkingSlot == null){
            throw new RuntimeException("No available parking lot");
        }

        Ticket ticket = new Ticket();
        ticket.setGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setParkingSlot(parkingSlot);
        ticket.setEntryTime(new Date());
        ticket.setOperator(gate.getCurrentOperator());

        return ticketRepository.save(ticket);
    }
}

// 7 mins
// Think about psuedo code
// thing how will you code it