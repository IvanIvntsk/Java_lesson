package hw2_3;

public class Comic extends Book{
    private String title;
    public Comic(String material, String name, String title) {
        super(material, name);
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Comic{" +
                ",material='" + getMaterial() + '\"' +
                "name='" + getName() + '\'' +
                "title='" + title + '\'' +
                '}';
    }
}
