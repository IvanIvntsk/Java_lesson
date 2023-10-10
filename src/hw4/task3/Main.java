//package hw4.task3;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        HashSet<Person> personHashSet = new HashSet<>();
//        personHashSet.add(new Person("Person1", Gender.MALE, Arrays.asList(new Skill("JS"), new Skill("html")))),
//        personHashSet.add(new Person("Person2",Gender.FEMALE,Arrays.asList(new Skill("JS"))),
//        personHashSet.add(new Person("Person3",Gender.MALE,Arrays.asList(new Skill("JS"), new Skill("Java"))),
//        personHashSet.add(new Person("Person4",Gender.FEMALE,Arrays.asList(new Skill("JS"), new Skill("css"))),
//        personHashSet.add(new Person("Person5",Gender.MALE,Arrays.asList(new Skill("css"))),
//        personHashSet.add(new Person("Person6",Gender.FEMALE, Arrays.asList(new Skill("JS"), new Skill("Java"),new Skill("python"))),
//        personHashSet.add(new Person("Person7",Gender.MALE,Arrays.asList(new Skill("JS"))),
//        personHashSet.add(new Person("Person8",Gender.FEMALE,Arrays.asList(new Skill("Java"),new Skill(""))),
////        personHashSet.add(new Person("Person9",Gender.MALE));
////        personHashSet.add(new Person("Person10",Gender.FEMALE));
//
//        for (Person person : personHashSet) {
//            System.out.println(person);
//        }
//        Iterator<Person> iterator = personHashSet.iterator();
//        while(iterator.hasNext()){
//            Person person = iterator.next();
//            if ("Gender.MALE".equals(person.getGender())){
//                iterator.remove();
//            }
//        }
//        for (Person person : personHashSet){
//            System.out.println(person.getName() + "---" + person.getGender());
//        }
//
//
//
//
//    }
//}
