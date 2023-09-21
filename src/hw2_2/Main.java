package hw2_2;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Asus","Master");
        System.out.println(pc);

        Laptop laptop = new Laptop("Asus", "Master", 16);
        System.out.println(laptop);

        Ultrabook ultrabook = new Ultrabook("Asus", "Master", 16, true);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation("Asus", "Master", 16, "intel");
        System.out.println(workstation);


    }
}
