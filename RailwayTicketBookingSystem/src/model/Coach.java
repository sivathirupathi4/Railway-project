package model;

public class Coach {
    private int id;
    private int trainId;
    private String code;
    private int totalBerths;

    public Coach(int id, int trainId, String code, int totalBerths) {
        this.id = id;
        this.trainId = trainId;
        this.code = code;
        this.totalBerths = totalBerths;
    }

    public int getId() { return id; }
    public int getTrainId() { return trainId; }
    public String getCode() { return code; }
    public int getTotalBerths() { return totalBerths; }
}