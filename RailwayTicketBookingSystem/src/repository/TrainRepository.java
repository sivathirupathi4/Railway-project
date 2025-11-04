package repository;

import model.Train;
import java.sql.*;
import java.util.*;

public class TrainRepository {
    public List<Train> getAllTrains() {
        List<Train> trains = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM train")) {
            while (rs.next()) {
                trains.add(new Train(rs.getInt("id"), rs.getString("number"), rs.getString("name")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return trains;
    }

    public void addTrain(Train train) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("INSERT INTO train(number, name) VALUES (?, ?)")) {
            ps.setString(1, train.getNumber());
            ps.setString(2, train.getName());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}