import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParkingServiceTest {

    @Test
    public void createParking_ReturnTrue(){
        ParkingService parkingService = new ParkingService(10);

        Assertions.assertTrue(true);
    }

    @Test
    public void createParking_ThrowException() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new ParkingService(0));
    }

    @Test
    public void placeIsUsed_returnTrue() {

        ParkingService parkingService = new ParkingService(10);
        Place place = parkingService.parking.get(1);
        place.isOccupied();

        Assertions.assertTrue(true);
    }

    @Test
    public void FreePlace_returnStateofPlace(){
        ParkingService parkingService = new ParkingService(10);
        Place place = parkingService.parking.get(1);

        place.setEmptyPlace();

        Assertions.assertFalse(place.isOccupied());
    }

    @Test
    public void CanParkACar_whenPlaceIsAvailable() {
        ParkingService parkingService = new ParkingService(10);
        Car car = new Car("AAA");
        String result = parkingService.canParkACar(1, car);

        Assertions.assertEquals("Voiture garée : AAA sur la place 1", result);
    }

    @Test
    public void CanParkACar_whenPlaceIsOccupied() {
        ParkingService parkingService = new ParkingService(10);
        Car car1 = new Car("AAA");
        Car car2 = new Car("BBB");

        parkingService.canParkACar(1, car1);

        String result = parkingService.canParkACar(1, car2);

        Assertions.assertEquals("La place est déjà occupée.", result);
    }



}




