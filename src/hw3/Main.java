package hw3;

public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("OWU",30);
        magazine.print();

        Book book = new Book("Steel", 300);
        book.print();

        Printable[] printables = new Printable[2];
        printables[0] = new Book("First", 200);
        printables[1] = new Magazine("Second", 100);

        for (Printable item : printables){
            item.print();
        }
    }
}
