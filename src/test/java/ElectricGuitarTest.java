import instruments.guitars.Electric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    Electric electricGuitar;

    @Before
    public void setUp(){
        electricGuitar = new Electric(
                "Fender",
                "Ash",
                "Sunburst",
                6,
                "single coil"
        );
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", electricGuitar.getBrand());
    }

    @Test
    public void hasMaterials(){
        assertEquals("Ash", electricGuitar.getMaterials());
    }

    @Test
    public void hasColour(){
        assertEquals("Sunburst", electricGuitar.getColour());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, electricGuitar.getNumberOfStrings());
    }

    @Test
    public void canGetPickUps(){
        assertEquals("single coil", electricGuitar.getPickUpType());
    }

}
