import instruments.drums.Drums;
import instruments.drums.KitItem;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    KitItem bassDrum;
    KitItem snareDrum;
    Drums drums;
    ArrayList<KitItem> kit;

    @Before
    public void setUp(){
        bassDrum = new KitItem("bass drum");
        snareDrum = new KitItem("snare drum");
        kit = new ArrayList<KitItem>();
        kit.add(bassDrum);
        kit.add(snareDrum);
        drums = new Drums("Pearl", "birch", "black", kit);

    }

    @Test
    public void hasBrand(){
        assertEquals("Pearl", drums.getBrand());
    }

    @Test
    public void hasMaterials(){
        assertEquals("birch", drums.getMaterials());
    }

    @Test
    public void hasColour(){
        assertEquals("black", drums.getColour());
    }


    @Test
    public void hasKitList(){
        assertEquals(2, drums.getKit().size());
    }

    @Test
    public void canPlayDrums(){
        assertEquals("boots and cats", drums.play());
    }
}
