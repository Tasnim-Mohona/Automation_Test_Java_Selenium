package AnimalKingdom;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal(25, 70));
        animals.add(new Animal(3, 4.55));
        animals.add(new Monkey(7, 39.5, "Banana"));
        animals.add(new Donkey(12, 69, "Donny"));
        animals.add(new Monkey(18, 75, "Bamboo"));
        animals.add(new Donkey(2, 32.2, "Little"));



        Zoo zoo = new Zoo(animals, "New York");
        zoo.PrintAnimals();
        zoo.FeedAnimals();

        List<Animal> filteredAnimals = AnimalsFilter.filterByAge(animals, 10);
        Zoo filteredZoo = new Zoo(filteredAnimals, "City of grown-up animals");
        filteredZoo.PrintAnimals();

        List<Zoo> zoos = new ArrayList<>();
        zoos.add(zoo);
        zoos.add(filteredZoo);

        System.out.println("Practice with lambda");
        zoos.stream()
                .filter(z -> z.getCity().contains("grown-up"))
                .forEach(Zoo::PrintAnimals);


        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // Narrowing Casting
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9


        Dog dog = new Dog(12, 5.00);

        AnimalsFilter.filterByAge(12);

        // Method Overloading
//        Animal animal1 = new Animal();
//        animal1.print(12, 14);
//        animal1.print();

        String day = "Monday";
        double month = 12.00;
        System.out.print(String.format("The day is %s, %f", day, month));

    }
}
