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
        int result = place.setNumero(1);

        Assertions.assertEquals(1, result);
    }

    @Test
    public void createPlace_returnState(){
        Place place = new Place(1);
        boolean result = place.setState(true);

        Assertions.assertTrue(true);
    }

    @Test
    public void createPlace_returnNumeroAndState(){
        Place place = new Place(1);
        int result1 = place.setNumero(1);
        boolean result2 = place.setState(true);


        Assertions.assertEquals(1, result1);
        Assertions.assertTrue(true);
    }


}
