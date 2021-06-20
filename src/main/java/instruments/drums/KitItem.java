package instruments.drums;

import instruments.Instrument;

public class KitItem extends Instrument {

    public String itemName;

    public KitItem(String brand, String materials, String colour, String itemName) {
        super(brand, materials, colour);
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }
}
