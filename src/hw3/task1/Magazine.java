package hw3.task1;

public class Magazine implements Printable {
    private String name;
    private int pages;

    public Magazine() {
    }

    public Magazine(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Magazine:" + this.name + this.pages);
    }
}
