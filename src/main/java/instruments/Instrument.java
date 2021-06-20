package instruments;

public abstract class Instrument {

    private String brand;
    private String materials;
    private String colour;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String brand,
                      String materials,
                      String colour,
                      double buyingPrice,
                      double sellingPrice) {
        this.brand = brand;
        this.materials = materials;
        this.colour = colour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterials() {
        return materials;
    }

    public String getColour() {
        return colour;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
