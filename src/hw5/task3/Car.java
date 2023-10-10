package hw5.task3;

import java.util.Objects;

public class Car {
    private String brand;
    private double enginePower;
    private Driver owner;
    private double price;
    private int productionYear;

    public Car() {
    }

    public Car(String brand, double enginePower, Driver owner, double price, int productionYear) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.owner = owner;
        this.price = price;
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public Driver getOwner() {
        return owner;
    }

    public void setOwner(Driver owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.enginePower, enginePower) == 0 && Double.compare(car.price, price) == 0 && productionYear == car.productionYear && Objects.equals(brand, car.brand) && Objects.equals(owner, car.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, enginePower, owner, price, productionYear);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", enginePower=" + enginePower +
                ", owner=" + owner +
                ", price=" + price +
                ", productionYear=" + productionYear +
                '}';
    }
}
