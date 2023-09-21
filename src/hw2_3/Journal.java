package hw2_3;

public class Journal extends Book{
private String title;

    public Journal(String material, String name, String title) {
        super(material, name);
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Journal{" +
                ",material='" + getMaterial() + '\"' +
                "name='" + getName() + '\'' +
                "title='" + title + '\'' +
                '}';
    }
}
