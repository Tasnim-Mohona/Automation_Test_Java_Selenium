package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // forEach : Performs an action for each element
        numbers.stream()
                .forEach(System.out::println);

        //  filter: Creates a new stream containing
        //  elements that match a predicate
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumbers);

        // map: Transform each element into a new object
        List<String> numberStrings = numbers.stream().map(Object::toString).toList();
        System.out.println(numberStrings);


        // toList: collects elements into a list
        List<Integer> collectedNumbers = numbers.stream().filter(n -> n > 5).toList();
        System.out.println(collectedNumbers);

        // Multiple commands inside 'Consumer'
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 7);
        Consumer<Integer> method = (n) -> {
            System.out.println("Number: " + n);
            System.out.println("Square: " + (n*n));
        };

        nums.forEach(method);
    }

}
