package AnimalKingdom;

// Base Animal Class
public abstract class Animal {
    // Fields for Age and Weight
    protected int age;
    protected double weight;

    // Constructor to initialize age and weight
    public Animal(int age, double weight)
    {
        this.age = age;
        this.weight = weight;
    }

    public void print(){
        System.out.println(age + weight);
    }


    public int print(int age, int weight){
        return age + weight;
    }


    // Method to simulate eating food
    public void EatFood() {
        System.out.println("Animal is eating food");
    }

    public void PrintInfo() {
        System.out.println("My age is" + age +", my weight is " + weight);

    }
    void makeSound() {
        System.out.println("Animal sound");
    }

    public void Run(){};
}
