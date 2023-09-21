package hw2_2;

public class Ultrabook extends Laptop{
    private boolean touchScreen;

    public Ultrabook(String brand, String model, double screenSize, boolean touchScreen) {
        super(brand, model, screenSize);
        this.touchScreen = touchScreen;
    }
    public boolean isTouchScreen() {
        return touchScreen;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "brand='" + getBrand() + '\"' +
                ",model='" + getModel() + '\"' +
                ".screenSize='" + getScreenSize() + '\"'+
                "touchScreen=" + touchScreen +

                '}';
    }
}
