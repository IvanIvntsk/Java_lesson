package hw4.task3;

import java.util.List;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private Gender gender;
    private List<Skill> skills;

    public Person() {
    }

    public Person(String name, Gender gender, List<Skill> skills) {
        this.name = name;
        this.gender = gender;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && gender == person.gender && Objects.equals(skills, person.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, skills);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", skills=" + skills +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.skills.size()-o.getSkills().size();
    }
}
