package Session5;

public class ParkingSystem {
    int[] spaces;

    public ParkingSystem(int big, int medium, int small) {
        spaces = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (spaces[carType-1]>0){
            spaces[carType-1]-=1;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem myParking = new ParkingSystem(5, 3, 2);
        myParking.addCar(1);
        myParking.addCar(3);
        System.out.println(myParking.addCar(3));
        System.out.println(myParking.addCar(3));
    }
}
