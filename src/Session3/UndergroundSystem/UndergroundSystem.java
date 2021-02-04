package Session3.UndergroundSystem;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to demonstrate an underground metro system
 * for example if A travels from cityA to cityB in 10 mins
 * B travels from cityA to cityB in 20 mins, the average time between cityA to cityB is (20+10)/2 = 15
 */
public class UndergroundSystem {
    private Map<Integer, Event> arrivals;
    private Map<String, Average> averages;
    private final String DELIMITER = ",";

    public UndergroundSystem () {
        arrivals = new HashMap<>();
        averages = new HashMap<> ();
    }

    public void checkIn (int id, String station, int checkInTime) {
        arrivals.put(id, new Event(id,station,checkInTime));
    }

    public void checkOut (int id, String station, int checkOutTime) {
        Event arrivalEvent = arrivals.get ( id );
        arrivals.remove ( id );

        int diff =checkOutTime - arrivalEvent.getCheckInTime();
        String key = arrivalEvent.getStation() + DELIMITER + station;
        Average average = averages.containsKey ( key )? averages.get ( key ) : new Average ( );

        average.updateAvg (diff);
        averages.put(key, average);
    }

    public double getAverageTime (String stationStart, String stationEnd) {
        return averages.get (stationStart+ DELIMITER +stationEnd).getAverage();
    }
}
