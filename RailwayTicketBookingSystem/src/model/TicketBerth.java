package model;

public class TicketBerth {
    private int id;
    private int ticketId;
    private int coachId;
    private int berthNo;

    public TicketBerth(int id, int ticketId, int coachId, int berthNo) {
        this.id = id;
        this.ticketId = ticketId;
        this.coachId = coachId;
        this.berthNo = berthNo;
    }

    public int getId() { return id; }
    public int getTicketId() { return ticketId; }
    public int getCoachId() { return coachId; }
    public int getBerthNo() { return berthNo; }
}
