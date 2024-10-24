package AnimalKingdom;

public class Donkey extends Animal {
    // Additional field for name
    private String name;

    // Constructor to initialize age, weight, and name
    public Donkey(int age, double weight, String name){
        super(age, weight);  // Call to parent class constructor
        this.name = name;
    }

    // Overriding PrintInfo method to include name
    @Override
    public void PrintInfo(){
        System.out.println("Donkey with name" + name + ": age" + age +", Weight" + weight);
    }
}
