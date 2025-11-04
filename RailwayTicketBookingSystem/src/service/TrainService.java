package service;

import repository.TrainRepository;
import model.Train;
import java.util.List;

public class TrainService {
    private TrainRepository repo = new TrainRepository();

    public List<Train> listTrains() {
        return repo.getAllTrains();
    }

    public void addTrain(String number, String name) {
        repo.addTrain(new Train(0, number, name));
    }
}
