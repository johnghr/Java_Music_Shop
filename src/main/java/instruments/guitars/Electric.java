package instruments.guitars;

public class Electric extends Guitar {

    private String pickUpType;

    public Electric(String brand, String materials, String colour, int numberOfStrings, String pickUpType) {
        super(brand, materials, colour, numberOfStrings);
        this.pickUpType = pickUpType;
    }
}
