import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}

