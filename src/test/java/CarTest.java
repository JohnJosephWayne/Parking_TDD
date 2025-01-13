
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {


    @Test
    public void createCar_returnImmatriculation(){
        Car car = new Car("AAAAAA");

        assertTrue(true);
    }

    @Test
    public void createCar_throwIllegalArgumentException(){

        assertThrows(IllegalArgumentException.class, () -> new Car(""));
    }

}
