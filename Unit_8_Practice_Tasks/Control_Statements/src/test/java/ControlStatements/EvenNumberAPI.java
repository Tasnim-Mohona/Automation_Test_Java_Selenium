package ControlStatements;

import java.util.Arrays;
import java.util.List;


// find out all the even numbers
// that exist in the list using Stream functions?
public class EvenNumberAPI {
        public static void main (String[] args){
            List<Integer> listOfNumbers = Arrays.asList(10, 8, 77, 45, 23);

            listOfNumbers.stream()
                    .filter(n -> n%2 == 0)
                    .forEach(System.out::println);


            listOfNumbers.stream()
                    .filter(n -> n%2 == 0)
                    .forEach(System.out::println);

            listOfNumbers.stream()
                    .map(s -> s + "")   // convert integer to String
                    .filter(s-> s.startsWith("1"))
                    .forEach(System.out::println);
        }
}
