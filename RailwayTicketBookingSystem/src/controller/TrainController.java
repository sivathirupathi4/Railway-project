package controller;

import service.TrainService;
import model.Train;
import java.util.List;

public class TrainController {
    private TrainService service = new TrainService();

    public void listTrains() {
        List<Train> trains = service.listTrains();
        for (Train t : trains) {
            System.out.println(t.getId() + " - " + t.getNumber() + " - " + t.getName());
        }
    } 

    public void addTrain(String number, String name) {
        service.addTrain(number, name);
        System.out.println("Train added successfully.");
    }
}
