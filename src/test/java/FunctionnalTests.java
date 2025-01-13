import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionnalTests {
    @Test
    public void PaymentAfterParking() {
        ParkingService parkingService = new ParkingService(10);
        Car car = new Car("AAA");

        String parkResult = parkingService.canParkACar(1, car);
        Assertions.assertEquals("Voiture garée : AAA sur la place 1", parkResult);

        int result = parkingService.paymentAfterParking(1, 10, 5);
        Assertions.assertEquals(50, result); // 10 minutes * 5 unités de prix par minute

        Place place = parkingService.parking.get(1);
        Assertions.assertFalse(place.isOccupied());
    }
}
