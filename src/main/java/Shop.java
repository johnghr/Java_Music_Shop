import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Instrument> stock;
    private double totalMarkupValue;

    public Shop(ArrayList stock){
        this.stock = stock;
    }

    public ArrayList<Instrument> getStock() {
        return stock;
    }

    public double calculateTotalMarkup(){
        for (Instrument instrument : stock) {
            totalMarkupValue += instrument.calculateMarkup();
        }
        return totalMarkupValue;
    }
}
