package hw2_5Additional;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Post(1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
        Post post2 = new Post(2, "qui est esse","est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla");
        Post post3 = new Post(3,"ea molestias quasi exercitationem repellat qui ipsa sit aut","et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut");

        Comment comment1 = new Comment(3,"odio adipisci rerum aut animi","Nikita@garfield.biz","quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione");
        Comment comment2 = new Comment(1,"id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");
        Comment comment3 = new Comment(2,"quo vero reiciendis velit similique earum","Jayne_Kuhic@sydney.com","est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et");

        Comment comment4 = new Comment(7,"repellat consequatur praesentium vel minus molestias voluptatum", "Dallas@ole.me","maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor");
        Comment comment5 = new Comment(8, "et omnis dolorem",  "Mallory_Kunze@marie.org","ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque");

        Comment comment6 = new Comment(13,"aut inventore non pariatur sit vitae voluptatem sapiente","Kariane@jadyn.tv","fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et");
        Comment comment7 = new Comment(14,  "et officiis id praesentium hic aut ipsa dolorem repudiandae","Nathan@solon.io","vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum");
        Comment comment8 = new  Comment(15,"debitis magnam hic odit aut ullam nostrum tenetur", "Maynard.Hodkiewicz@roberta.com","nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia");

        List<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        List<Comment> comments = new ArrayList<>();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        comments.add(comment4);
        comments.add(comment5);
        comments.add(comment6);
        comments.add(comment7);
        comments.add(comment8);

        for (Post post : posts) {
            List<Comment> postComments = new ArrayList<>();
            for (Comment comment : comments){
                if (comment.getId() == post.getId()){
                    postComments.add(comment);
                }
            }
            post.getComments().addAll(postComments);
        }
        for (Post post : posts) {
            System.out.println("Post ID:" +post.getId());
            System.out.println("Title:" + post.getTitle());
            System.out.println("Body:" + post.getBody());
            System.out.println("Comments:");
            for (Comment comment : post.getComments()){
                System.out.println("Comment ID:" + comment.getId());
                System.out.println("Name:" + comment.getName());
                System.out.println("Email:" + comment.getEmail());
                System.out.println("Body:" + comment.getBody());
            }
        }
    }
}
