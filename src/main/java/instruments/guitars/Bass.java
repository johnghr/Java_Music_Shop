package instruments.guitars;

public class Bass extends Guitar {

    private String stringType;

    public Bass(
            String brand,
            String materials,
            String colour,
            double buyingPrice,
            double sellingPrice,
            int numberOfStrings,
            String stringType
    ) {
        super(brand, materials, colour,  buyingPrice, sellingPrice, numberOfStrings);
        this.stringType = stringType;
    }

    public String getStringType() {
        return stringType;
    }

    public String play(){
        return "bum bum bah bum";
    }

}