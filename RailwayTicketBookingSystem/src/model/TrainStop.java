package model;

import java.util.Date;

public class TrainStop {
    private int id;
    private int trainId;
    private int stationId;
    private Date arrTs;
    private Date depTs;
    private int dayOffset;

    public TrainStop(int id, int trainId, int stationId, Date arrTs, Date depTs, int dayOffset) {
        this.id = id;
        this.trainId = trainId;
        this.stationId = stationId;
        this.arrTs = arrTs;
        this.depTs = depTs;
        this.dayOffset = dayOffset;
    }

    public int getId() { return id; }
    public int getTrainId() { return trainId; }
    public int getStationId() { return stationId; }
    public Date getArrTs() { return arrTs; }
    public Date getDepTs() { return depTs; }
    public int getDayOffset() { return dayOffset; }
}