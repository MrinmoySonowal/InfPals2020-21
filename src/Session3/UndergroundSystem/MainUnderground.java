package Session3.UndergroundSystem;

/**
 * Main function to run our underground system
 */
public class MainUnderground {
    public static void main (String[] args) {
        UndergroundSystem ugs = new UndergroundSystem ();
        ugs.checkIn(1,"King's Cross",3);
        ugs.checkIn(2,"King's Cross",5);
        ugs.checkOut(1,"Paddington",10);
        ugs.checkOut(2,"Paddington",15);
        System.out.println ( ugs.getAverageTime ("King's Cross", "Paddington") );
    }
}
