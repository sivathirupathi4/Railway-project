package controller;

import service.TicketService;
import model.Ticket;
import java.util.List;

public class TicketController {
    private TicketService service = new TicketService();

    public void listTickets() {
        List<Ticket> tickets = service.listTickets();
        for (Ticket t : tickets) {
            System.out.println("TicketID: " + t.getId() +
                               " | TrainID: " + t.getTrainId() +
                               " | UserID: " + t.getUserId() +
                               " | From StationID: " + t.getSourceStationId() +
                               " | To StationID: " + t.getDestinationStationId() +
                               " | Status: " + t.getStatus());
        }
    }

    public void bookTicket(int trainId, int userId, int sourceStationId, int destinationStationId) {
        service.bookTicket(trainId, userId, sourceStationId, destinationStationId);
        System.out.println("✅ Ticket booked successfully.");
    }
}