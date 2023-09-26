package hw3;

public class Magazine implements Printable {
    private String name;
    private int pages;

    public Magazine() {
    }

    public Magazine(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public void print() {
        System.out.println("Magazine:" + name + pages);
    }
}
