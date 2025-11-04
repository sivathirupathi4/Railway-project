package repository;

import model.Ticket;
import java.sql.*;
import java.util.*;

public class TicketRepository {
    public List<Ticket> getAllTickets() {
        List<Ticket> tickets = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM ticket")) {
            while (rs.next()) {
                tickets.add(new Ticket(
                        rs.getInt("id"),
                        rs.getInt("train_id"),
                        rs.getInt("user_id"),
                        rs.getInt("source_station_id"),
                        rs.getInt("destination_station_id"),
                        rs.getString("status")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tickets;
    }

    public void addTicket(Ticket ticket) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                 "INSERT INTO ticket(train_id, user_id, source_station_id, destination_station_id, status) VALUES (?, ?, ?, ?, ?)")) {
            ps.setInt(1, ticket.getTrainId());
            ps.setInt(2, ticket.getUserId());
            ps.setInt(3, ticket.getSourceStationId());
            ps.setInt(4, ticket.getDestinationStationId());
            ps.setString(5, ticket.getStatus());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}