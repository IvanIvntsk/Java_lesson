package hw2_3;

public class Papyrus {
    private String material;

    public Papyrus() {
    }

    public Papyrus(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "material='" + material + '\'' +
                '}';
    }
}
