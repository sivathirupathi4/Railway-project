package repository;

import model.Station;
import java.sql.*;
import java.util.*;

public class StationRepository {
    public List<Station> getAllStations() {
        List<Station> stations = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM station")) {
            while (rs.next()) {
                stations.add(new Station(rs.getInt("id"), rs.getString("code"), rs.getString("name")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stations;
    }

    public void addStation(Station station) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("INSERT INTO station(code, name) VALUES (?, ?)")) {
            ps.setString(1, station.getCode());
            ps.setString(2, station.getName());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
