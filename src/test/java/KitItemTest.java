import instruments.Instrument;
import instruments.drums.KitItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KitItemTest {

    KitItem bassDrum;

    @Before
    public void setUp(){
        bassDrum = new KitItem("Pearl", "birch", "black", "bass drum");
    }

    @Test
    public void hasBrand(){
        assertEquals("Pearl", bassDrum.getBrand());
    }

}
