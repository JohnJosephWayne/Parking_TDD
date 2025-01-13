import java.util.HashMap;

public class ParkingService {

    private Place place;
    private Car car;

    private double price;

    HashMap<Integer, Place> parking;

    public ParkingService(int numberOfPlaces) {
        if (numberOfPlaces <= 0) {
            throw new IllegalArgumentException("Le parking doit avoir au moins une place.");
        }
        parking = new HashMap<>();
        for (int i = 1; i <= numberOfPlaces; i++) {
            parking.put(i, new Place(i));
        }

    }
}
