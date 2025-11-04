package controller;

import service.StationService;
import model.Station;
import java.util.List;

public class StationController {
    private StationService service = new StationService();

    public void listStations() {
        List<Station> stations = service.listStations();
        for (Station s : stations) {
            System.out.println(s.getId() + " - " + s.getCode() + " - " + s.getName());
        } 
    }

    public void addStation(String code, String name) {
        service.addStation(code, name);
        System.out.println("Station added successfully.");
    }
}