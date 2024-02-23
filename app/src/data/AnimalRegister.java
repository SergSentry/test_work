package data;

import java.util.HashSet;
import java.util.Set;

public class AnimalRegister {
    private Set<Animal> register;
    private int animalCounter;

    private int id = 0;

    public AnimalRegister() {
        this.register = new HashSet<>();
        this.animalCounter = 0;
    }

    public void add_animal(Animal animal){
        id++;
        animal.setId(id);
        this.register.add(animal);
        this.animalCounter++;
    }

    public void delete_animal(Animal animal){
        this.register.remove(animal);
        this.animalCounter--;
    }



    public Set<Animal> getRegister() {
        return register;
    }

    public void setRegister(Set<Animal> register) {
        this.register = register;
    }

    public int getAnimalCounter() {
        return animalCounter;
    }


    @Override
    public String toString() {
        return "Animals in register: \n"+ register +
                "\nanimals count: " + animalCounter;
    }
}
