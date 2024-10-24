package AnimalKingdom;

// Child class Monkey inheriting from Animal
public class Monkey extends Animal {
    // Additional field for food type
    private final String foodType;

    //Constructor to initialize age, weight, and food type
    public Monkey(int age, double weight, String foodType){
        super(age, weight);
        this.foodType = foodType;
    }

    // Overriding EatFood method to include food type
    @Override
    public void EatFood(){
        System.out.println("This monkey loves" + foodType);
    }
}
