package instruments.guitars;

import instruments.Instrument;

public abstract class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String brand, String materials, String colour, int numberOfStrings) {
        super(brand, materials, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
