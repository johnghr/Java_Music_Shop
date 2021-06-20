package instruments.guitars;

public class Bass extends Guitar {

    private String stringType;

    public Bass(String brand, String materials, String colour, int numberOfStrings, String pickUpType) {
        super(brand, materials, colour, numberOfStrings);
        this.stringType = stringType;
    }
}