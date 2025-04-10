package LLDCaseStudy.ParkingLot.repositories;

import LLDCaseStudy.ParkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Integer, Ticket> tickets;
    private static int counter = 0;

    public TicketRepository() {
        tickets = new TreeMap<>();
    }

    public Ticket save(Ticket ticket) {
        counter++;
        ticket.setId(counter);
        tickets.put(counter, ticket);
        return ticket;
    }

}
