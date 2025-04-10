package LLDCaseStudy.ParkingLot;

import LLDCaseStudy.ParkingLot.controllers.TicketController;
import LLDCaseStudy.ParkingLot.models.ParkingLot;
import LLDCaseStudy.ParkingLot.repositories.GateRepository;
import LLDCaseStudy.ParkingLot.repositories.ParkingLotRepository;
import LLDCaseStudy.ParkingLot.repositories.TicketRepository;
import LLDCaseStudy.ParkingLot.repositories.VehicleRepository;
import LLDCaseStudy.ParkingLot.services.TicketService;

public class Client {
    public static void main(String[] args) {

        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);
        // create the request
//        ticketController.issueTicket();
    }
}


// Feature : Ticket Generation

// Input : gateId , licensePlate, ownerName , vehicleType
// Output : all the ticket details specifically slot

// TicketController : Ticket model is most focused
