import instruments.Instrument;
import instruments.guitars.Bass;
import instruments.guitars.Electric;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Bass bassGuitar;
    Electric electricGuitar;
    ArrayList<Instrument> stock;

    @Before
    public void setUp(){
        bassGuitar = new Bass(
                "Fender",
                "Ash",
                "Sunburst",
                700,
                900,
                4,
                "flats"
        );
        electricGuitar = new Electric(
                "Fender",
                "Ash",
                "Sunburst",
                6,
                700.00,
                900,
                "single coil"

        );
        stock = new ArrayList<Instrument>();
        stock.add(bassGuitar);
        stock.add(electricGuitar);
        shop = new Shop(stock);
    }

    @Test
    public void shopHasStock(){
        assertEquals(2, shop.getStock().size());
    }


}
