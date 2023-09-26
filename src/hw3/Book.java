package hw3;

public class Book implements Printable {
    private String name;
    private int pages;

    public Book() {
    }

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }


    @Override
    public void print() {
        System.out.println("Book:" + name + pages);
    }
}