package instruments.guitars;

public class Electric extends Guitar {

    private String pickUpType;

    public Electric(
            String brand,
            String materials,
            String colour,
            int numberOfStrings,
            double buyingPrice,
            double sellingPRice,
            String pickUpType
    ) {
        super(brand, materials, colour,  buyingPrice, sellingPRice, numberOfStrings);
        this.pickUpType = pickUpType;
    }

    public String getPickUpType() {
        return pickUpType;
    }
}
