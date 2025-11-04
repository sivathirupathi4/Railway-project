package service;

import repository.StationRepository;
import model.Station;
import java.util.List;

public class StationService {
    private StationRepository repo = new StationRepository();

    public List<Station> listStations() {
        return repo.getAllStations();
    }

    public void addStation(String code, String name) {
        repo.addStation(new Station(0, code, name));
    }
}