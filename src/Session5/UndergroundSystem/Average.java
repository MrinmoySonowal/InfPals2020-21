package Session5.UndergroundSystem;

/**
 * Class to represent the average travel time between two stations
 * Average class instances are stored in the averages map in Session5.UndergroundSystem.java
 */
public class Average {
    private int totalTime = 0;
    private int totalCustomers = 0;

    /**
     * whenever a customer gets out of the train we update the average
     * This is because the total number of customers inc. by 1 and total travel time between the two stations increase
     * @param diff - time difference between departure and arrival time
     */
    public void updateAvg(int diff){
        totalTime     += diff;
        totalCustomers++;
    }

    /**
     * Method to calculate the average travel time between two stations
     * @return - Average by dividing the total travel time between the stations by total number of customers
     */
    public double getAverage(){
        return totalTime / (double) totalCustomers ; // floating point division
    }
}
