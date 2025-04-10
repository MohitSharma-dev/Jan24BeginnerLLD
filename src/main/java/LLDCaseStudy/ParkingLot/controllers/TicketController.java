package LLDCaseStudy.ParkingLot.controllers;

import LLDCaseStudy.ParkingLot.dtos.IssueTicketRequestDTO;
import LLDCaseStudy.ParkingLot.dtos.IssueTicketResponseDTO;
import LLDCaseStudy.ParkingLot.dtos.ResponseStatus;
import LLDCaseStudy.ParkingLot.models.Ticket;
import LLDCaseStudy.ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        // we need handle the exceptions gracefully
        // I don't want my client to understand my exceptions
        // I want my client to read simple message in case if anything goes wrong

        try {
            Ticket ticket = ticketService.issueTicket(
                    request.getLicensePlate(),
                    request.getOwnerName(),
                    request.getGateId(),
                    request.getVehicleType(),
                    request.getParkingLotId()
            );
            response.setTicketId(ticket.getId());
            response.setSlotNumber(ticket.getParkingSlot().getNumber());
            response.setFloorNumber(ticket.getParkingSlot().getParkingFloor().getNumber());
            response.setMessage("Ticket Generated Successfully");
            response.setStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex){
            response.setMessage(ex.getMessage());
            response.setStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}

// DTO's : Date Transfer Objects
