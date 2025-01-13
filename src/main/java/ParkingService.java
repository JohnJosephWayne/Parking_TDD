import java.util.HashMap;

public class ParkingService {

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

    public String canParkACar(int number, Car car) {
        Place place = parking.get(number);
        if (place == null || number < 0) {
            return "Place invalide.";
        }
        if (place.isOccupied()) {
            return "La place est déjà occupée.";
        } else {
            place.setFullPlace(car);
            return "Voiture garée : " + car.getImmatriculation() + " sur la place " + place.getNumero();
        }
    }

    public int paymentAfterParking(int number, int minute, int price) {
        Place place = parking.get(number);
        if (place == null) {
            System.out.println("Erreur : la place n'existe pas.");
            return 0;
        }
        if (!place.isOccupied()) {
            System.out.println("Erreur : la place n'est pas occupée.");
            return 0;
        }
        if (place.getCar() == null) {
            System.out.println("Erreur : aucune voiture sur la place.");
            return 0;
        }

        Car car = place.getCar();
        place.setEmptyPlace();
        return minute * price; // Renvoie le calcul correct si toutes les conditions sont satisfaites
    }
}
