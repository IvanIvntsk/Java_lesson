package hw4.task3;

public class PersonSkill {
    private String name;
    private  int skill;

    public PersonSkill() {
    }

    public PersonSkill(String name, int skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "PersonSkill{" +
                "name='" + name + '\'' +
                ", skill=" + skill +
                '}';
    }
}
