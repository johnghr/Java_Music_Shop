import instruments.Instrument;
import instruments.drums.KitItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KitItemTest {

    KitItem bassDrum;

    @Before
    public void setUp(){
        bassDrum = new KitItem("bass drum");
    }

    @Test
    public void hasItemName(){
        assertEquals("bass drum", bassDrum.getItemName());
    }

}
