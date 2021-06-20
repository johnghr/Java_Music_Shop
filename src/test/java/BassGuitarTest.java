import instruments.guitars.Bass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {

    Bass bassGuitar;

    @Before
    public void setUp(){
        bassGuitar = new Bass(
                "Fender",
                "Ash",
                "Sunburst",
                700,
                900,
                4,
                "flats");
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", bassGuitar.getBrand());
    }

    @Test
    public void hasMaterials(){
        assertEquals("Ash", bassGuitar.getMaterials());
    }

    @Test
    public void hasColour(){
        assertEquals("Sunburst", bassGuitar.getColour());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(4, bassGuitar.getNumberOfStrings());
    }

    @Test
    public void canGetPickUps(){
        assertEquals("flats", bassGuitar.getStringType());
    }

    @Test
    public void canPlayBass(){
        assertEquals("bum bum bah bum", bassGuitar.play());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(700.00, bassGuitar.getBuyingPrice(),00);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(900.00, bassGuitar.getSellingPrice(), 00);
    }

}
