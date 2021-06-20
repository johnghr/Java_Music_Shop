package instruments.drums;

import instruments.Instrument;

import java.util.ArrayList;

public class Drums extends Instrument {

    private ArrayList<KitItem> kit;

    public Drums(String brand, String materials, String colour) {
        super(brand, materials, colour);
        this.kit = new ArrayList<>();
    }

    public ArrayList<KitItem> getKit() {
        return kit;
    }
}
