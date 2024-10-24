package AnimalKingdom;

import lombok.Getter;

import java.util.List;

public class Zoo {
    @Getter
    private String city;
    private List<Animal> animals;

    public Zoo(List<Animal> animals, String city) {
        this.animals = animals;
        this.city = city;
    }

    public void PrintAnimals() {
        System.out.println("In " + city + " zoo we have animals:");
        for (Animal animal : animals) {
            animal.PrintInfo();
        }
    }

    public void FeedAnimals() {
        System.out.println("Let's feed animals in " + city + " Zoo!");
        int i = 0;
        while (i < animals.size()) {
            animals.get(i).EatFood();
            i++;
        }
    }

}