package model;

public class Train {
    private int id;
    private String number;
    private String name;

    public Train(int id, String number, String name) {
        this.id = id;
        this.number = number;
        this.name = name;
    }

    public int getId() { return id; }
    public String getNumber() { return number; }
    public String getName() { return name; }
}