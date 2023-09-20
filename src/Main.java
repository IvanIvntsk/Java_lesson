public class Main {
    public static void main(String[] args) {
       Book[] books = new Book[]{
               new Book("Title", 100, new String[]{"author", }, "fantastic"),
               new Book("Title1", 101, new String[]{"author1", }, "fantastic"),
               new Book("Title2", 102, new String[]{"author2", }, "fantastic"),
               new Book("Title3", 103, new String[]{"author4", }, "fantastic"),
               new Book("Title4", 104, new String[]{"author4", }, "fantastic"),
       };
       Car[] cars = new Car[]{
               new Car("Model", 200, 2.0, true),
               new Car("Model2", 200, 2.0, false),
               new Car("Model3", 200, 2.0, true),
               new Car("Model4", 200, 2.0, false),
               new Car("Model5", 200, 2.0, true),
       };
       Dog[] dogs = new Dog[]{
         new Dog("Dog", 2, "poroda"),
         new Dog("Dog1", 2, "poroda2"),
         new Dog("Dog2", 1, "poroda3"),
         new Dog("Dog3", 3, "poroda4"),
         new Dog("Dog4", 5, "poroda5"),
       };

//       Post/Comment
        Post[] posts = new Post[]{
                new Post(0, 0, "Title", "body"),
                new Post(1, 1, "Title", "body"),
                new Post(2, 2, "Title", "body"),
                new Post(3, 3, "Title", "body"),
                new Post(4, 4, "Title", "body"),
        };
        Comment[] comments = new Comment[]{
          new Comment(0,0,"Name","email","body"),
          new Comment(1,1,"Name","email","body"),
          new Comment(2,2,"Name","email","body"),
          new Comment(3,3,"Name","email","body"),
          new Comment(4,4,"Name","email","body"),
        };
        for (Book book: books){
            System.out.println(book);
        }
        for (int index = 0; index < cars.length; index ++){
            Car car = cars[index];
            System.out.println(index + ":" + car);
        }
        int index = 0;
        while (index < dogs.length)  {
            Dog dog = dogs[index];
            System.out.println(dog);
            index ++;
        }
        for (Post post : posts){
            System.out.println(post);
        }
        for (Comment comment : comments){
            System.out.println(comment);
        }

    }
}