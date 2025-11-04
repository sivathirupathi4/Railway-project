package model;

public class Ticket {
    private int id;
    private int trainId;
    private int userId;
    private int sourceStationId;
    private int destinationStationId;
    private String status;

    public Ticket(int id, int trainId, int userId, int sourceStationId, int destinationStationId, String status) {
        this.id = id;
        this.trainId = trainId;
        this.userId = userId;
        this.sourceStationId = sourceStationId;
        this.destinationStationId = destinationStationId;
        this.status = status;
    }

    public int getId() { return id; }
    public int getTrainId() { return trainId; }
    public int getUserId() { return userId; }
    public int getSourceStationId() { return sourceStationId; }
    public int getDestinationStationId() { return destinationStationId; }
    public String getStatus() { return status; }
}