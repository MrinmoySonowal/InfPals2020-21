package Session3.UndergroundSystem;

public class Event {
    private int id;
    private String station;
    private int checkInTime;

    public Event (int id, String station, int checkInTime) {
        this.id          = id;
        this.station     = station;
        this.checkInTime = checkInTime;
    }

    public int getId () {
        return id;
    }

    public String getStation () {
        return station;
    }

    public int getCheckInTime () {
        return checkInTime;
    }
}
