import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Instrument> stock;

    public Shop(ArrayList stock){
        this.stock = stock;
    }

    public ArrayList<Instrument> getStock() {
        return stock;
    }
}
