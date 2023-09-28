package hw4.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Person1", Gender.MALE);
        Person person2 = new Person("Person2",Gender.FEMALE);
        Person person3 = new Person("Person3",Gender.MALE);
        Person person4 = new Person("Person4",Gender.FEMALE);
        Person person5 = new Person("Person5",Gender.MALE);
        Person person6 = new Person("Person6",Gender.FEMALE);
        Person person7 = new Person("Person7",Gender.MALE);
        Person person8 = new Person("Person8",Gender.FEMALE);
        Person person9 = new Person("Person9",Gender.MALE);
        Person person10 = new Person("Person10",Gender.FEMALE);

        Set<Person> personSet = new HashSet<>();

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);
        personSet.add(person7);
        personSet.add(person8);
        personSet.add(person9);
        personSet.add(person10);
//        for (Person person : personSet){
//            System.out.println(person.getName() + "-" + person.getGender());
//        }
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
                    if("MALE".equals(person.getGender())){
                        iterator.remove();
                    }
        }
        for (Person person : personSet){
            System.out.println(person.getName() + "-" + person.getGender());
        }

        PersonSkill person11 = new PersonSkill("Person1",1 );
        PersonSkill person22 = new PersonSkill("Person2",2);
        PersonSkill person33 = new PersonSkill("Person3",3);
        PersonSkill person44 = new PersonSkill("Person4",4);
        PersonSkill person66 = new PersonSkill("Person5",5);
        PersonSkill person77 = new PersonSkill("Person6",6);
        PersonSkill person88 = new PersonSkill("Person7",7);
        PersonSkill person99 = new PersonSkill("Person8",8);
        PersonSkill person101 = new PersonSkill("Person9",9);


        Comparator<PersonSkill> skill = Comparator.comparingInt(PersonSkill::getSkill);
        TreeSet<PersonSkill> personSkill = new TreeSet<>(skill);

        personSkill.add(person11);
        personSkill.add(person22);
        personSkill.add(person33);
        personSkill.add(person44);
        personSkill.add(person66);
        personSkill.add(person77);
        personSkill.add(person88);
        personSkill.add(person99);
        personSkill.add(person101);

        for (PersonSkill personSkill1 : personSkill){
            System.out.println(personSkill1.getName() + "-" + personSkill1.getSkill() + "skill");
        }
    }
}
