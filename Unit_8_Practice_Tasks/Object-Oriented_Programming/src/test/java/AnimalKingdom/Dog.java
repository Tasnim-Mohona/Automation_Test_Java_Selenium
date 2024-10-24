package AnimalKingdom;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.SocketException;

import static net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.read;

public class Dog extends Animal implements PrintInfo, Act {
    public Dog(int age, double weight) {
        super(age, weight);
    }

    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
    void makeSound(int age, String name){
        System.out.println(String.format("Your formatted string here with placeholders: %s, %d", name, age));
    }

    @Override
    public void Run(){
        System.out.println("Dog Runs");
    }

//    public void Sleep(){
//        System.out.println(Arrays.toString(s));
//        for(String sleep : s){
//            System.out.println(sleep);
//        System.out.println("Dog Runs");
//            super.makeSound();
//        }

    @Override
    public void eat() {
        System.out.println("Dog Eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override

    
    public void run() {
        System.out.println("Dog Runs");
    }

    @Override
    public void fly() {

        try{
            FileReader read = new FileReader("read.pdf");
        }

        catch (IOException e){
            System.out.println("IOException");
        }

//        catch (SocketException|FileNotFoundException exception)
//        {
//            System.out.println(exception.getMessage());
//            throw new RuntimeException();
//        }
        finally {
            System.out.print("Error message");
        }
    }
}
