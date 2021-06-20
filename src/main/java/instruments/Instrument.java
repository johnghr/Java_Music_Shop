package instruments;

public abstract class Instrument {

    private String brand;
    private String materials;
    private String colour;



    public Instrument(String brand, String materials, String colour) {
        this.brand = brand;
        this.materials = materials;
        this.colour = colour;
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

}
