package instruments.guitars;

import instruments.Instrument;

public class Acoustic extends Guitar {
    public Acoustic(
            String brand,
            String materials,
            String colour,
            double buyingPrice,
            double sellingPrice,
            int numberOfStrings) {
        super(brand, materials, colour, buyingPrice, sellingPrice, numberOfStrings);
    }
}
