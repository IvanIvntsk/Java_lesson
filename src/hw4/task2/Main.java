package hw4.task2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1,"Kokos","Ose","kokos@owu.com",4,Gender.MALE,
                new Car("Oka", 2000, 111));
        person.getSkills().add(new Skill("Java",3));
        person.getSkills().add(new Skill("JS",2));

        System.out.println(person);
    }
}
