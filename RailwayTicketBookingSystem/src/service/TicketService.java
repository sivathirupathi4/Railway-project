package service;

import repository.TicketRepository;
import model.Ticket;
import java.util.List;

public class TicketService {
    private TicketRepository repo = new TicketRepository();

    public List<Ticket> listTickets() {
        return repo.getAllTickets();
    }

    public void bookTicket(int trainId, int userId, int sourceStationId, int destinationStationId) {
        repo.addTicket(new Ticket(0, trainId, userId, sourceStationId, destinationStationId, "BOOKED"));
    }
}