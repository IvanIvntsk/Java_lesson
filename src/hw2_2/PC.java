package hw2_2;

public class PC {
    private String brand;
    private String model;

    public PC() {
    }

    public PC(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "PC{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
