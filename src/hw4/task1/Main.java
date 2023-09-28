package hw4.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Bender",4);
        Person person2 = new Person(2,"Amy Wong",20);
        Person person3 = new Person(3,"Hermes Conrad",41);
        Person person4 = new Person(4,"Philip J Fry.",25);
        Person person5 = new Person(5,"Turanga Leela",30);
        Person person6 = new Person(6,"Hubert J. Farnsworth",4);
        Person person7 = new Person(7,"Zoidberg",40);

        List<Person> persons = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);

        Comparator<Person> age = Comparator.comparingInt(Person::getAge);
        Collections.sort(persons, age);

        for (Person person : persons){
            System.out.println(person.getName() + "-"+ person.getAge() + "age");
        }
        //Reversed
        Comparator<Person> ageReversed = Comparator.comparingInt(Person::getAge).reversed();
        Collections.sort(persons, ageReversed);

        for (Person person : persons){
            System.out.println(person.getName() + "-"+ person.getAge() + "age");
        }

        Comparator<Person> lengthAscending = Comparator.comparingInt(person -> person.getName().length());
        Collections.sort(persons, lengthAscending);

        for (Person person : persons) {
            System.out.println("Name length Ascending" + person.getName());
        }
        Comparator<Person> lengthDescending = Comparator.comparingInt(person -> person.getName().length());
        lengthDescending = lengthDescending.reversed();
        Collections.sort(persons, lengthDescending);

        for (Person person : persons) {
            System.out.println("Name length Ascending" + person.getName());
        }
    }
}
