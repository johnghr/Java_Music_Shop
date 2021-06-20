package instruments.drums;

import behaviours.IPlay;
import instruments.Instrument;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Drums extends Instrument implements IPlay {

    private final ArrayList<KitItem> kit;

    public Drums(String brand, String materials, String colour, ArrayList<KitItem> kit, double buyingPrice, double sellingPrice) {
        super(brand, materials, colour, buyingPrice, sellingPrice);
        this.kit = new ArrayList<>(kit);
    }

    public ArrayList<KitItem> getKit() {
        return kit;
    }

    @Override
    public String play() {
        return "boots and cats";
    }
}
