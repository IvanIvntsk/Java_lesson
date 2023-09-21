package hw2_3;

public class Book extends Papyrus{
    private String name;

    public Book(String material, String name){
        super(material);
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                ",material='" + getMaterial() + '\"' +
                "name='" + name + '\'' +
                '}';
    }
}
