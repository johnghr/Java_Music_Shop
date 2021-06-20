package instruments.drums;

import instruments.Instrument;

public class KitItem extends Instrument {

    public String item;

    public KitItem(String brand, String materials, String colour, String item) {
        super(brand, materials, colour);
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
