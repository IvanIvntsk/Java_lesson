package hw2_4;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,
                "kokos",
                "kokosov",
                "kokos@owu.com",
                1,
                Gender.MALE,
                new Car("oka", 2024, 200));
        user.getSkills().add(new Skill("Java", 1));
        user.getSkills().add(new Skill("JS", 2));

        System.out.println(user);
    }
}
