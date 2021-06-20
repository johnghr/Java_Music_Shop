package instruments.guitars;

import instruments.Instrument;

public abstract class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String brand,
                  String materials,
                  String colour,
                  double buyingPrice,
                  double sellingPrice,
                  int numberOfStrings
    ) {
        super(brand, materials, colour, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Wah wah chicka";
    }
}
