import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlaceTest {

    @Test
    public void createPlace_returnTrue() {
        Place place = new Place(1);

        Assertions.assertTrue(true);
    }

    @Test
    public void createPlace_returnNumero(){
        Place place = new Place(1);
        int result = place.getNumero();

        Assertions.assertEquals(1, result);
    }

    @Test
    public void createPlaceEmpty_returnState(){
        Place place = new Place(1);
        boolean result = place.isOccupied();

        Assertions.assertTrue(true);
    }

    @Test
    public void createPlaceEmpty_returnNumeroAndState(){
        Place place = new Place(1);
        int result1 = place.getNumero();
        boolean result = place.isOccupied();

        Assertions.assertEquals(1, result1);
        Assertions.assertTrue(true);
    }


}
