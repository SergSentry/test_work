package data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public abstract class Animal{
    private String name;
    private String type;
    private String view;
    private LocalDate birthdate;

    private Set<String> skills;

    private int id;

    public Animal(String name, CharSequence birthdate) {
        this.name = name;
        this.birthdate = LocalDate.parse(birthdate);
        this.skills = new HashSet<>();
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Animal name: " + name +
                ", birthdate: " + birthdate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    public void trainSkill(String skill){
        this.skills.add(skill);
    }

}
