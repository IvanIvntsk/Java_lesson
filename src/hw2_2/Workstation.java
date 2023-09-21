package hw2_2;

public class Workstation extends Laptop{
    private String processor;
    public Workstation(String brand, String model, double screenSize, String processor) {
        super(brand, model, screenSize);
        this.processor = processor;
    }
    public String getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "brand='" + getBrand() + '\"' +
                ",model='" + getModel() + '\"' +
                ",screenSize=" + getScreenSize() + '\"' +
                "processor='" + processor + '\'' +
                '}';
    }
}
