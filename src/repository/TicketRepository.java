package repository;

import exception.TicketNotFoundException;
import models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer, Ticket> ticketMap;

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public Ticket get(int ticketId) throws TicketNotFoundException {
        Ticket ticket = ticketMap.get(ticketId);
        if (ticket == null){
            throw new TicketNotFoundException(" Ticket Not Found for the Id: " + ticketId);
        }return ticket;
    }
    public Ticket put(Ticket ticket){
        ticketMap.put(ticket.getId(),ticket);
        return ticket;
    }
}
