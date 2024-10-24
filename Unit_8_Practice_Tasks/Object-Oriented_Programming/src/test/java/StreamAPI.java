import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        //Collecting Stream Elements
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredNames);
        System.out.println();
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        List<String> BanglaNames = Arrays.asList("Aava", "biva", "chonda");
        Stream<String> stream = BanglaNames.stream().filter(name -> name.length() > 3)
//                .map(String::toUpperCase);
                .map(name -> name.toUpperCase());
//        System.out.println(stream);  //wrong
        // int the filtered and transformed names,
        //you need to collect the elements from the
        // stream into a list or print them directly
        // using a terminal operation like forEach.
        stream.forEach(System.out::println);

        // Sum of even numbers
        List<Integer> numbers = Arrays.asList(111, 12, 13, 14, 17, 18);
        int sumOfEvens = numbers.stream().filter(n -> n % 2 == 0) //filter even numbers
                .mapToInt(Integer::intValue) //convert to int
                .sum(); // Sum the even numbers
        System.out.println(sumOfEvens);

        // Using peek with sum of even numbers
        List<Integer> numbers1 = Arrays.asList(77, 55, 33, 22, 11, 0, 9);
        numbers1.stream().filter(n -> n % 2 == 0)    // Filter even numbers
                .mapToInt(Integer::intValue).peek(System.out::println);

        //Count Strings with a Specific Length
        List<String> words = Arrays.asList("Cat", "elephant", "dog", "tiger");
        long count = words.stream()
                .filter(word-> word.length()>3)   // filter strings with length > 3
                .count();  //count the filtered string
        System.out.println(count);  // output


        // Group strings by their length
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
                System.out.println(groupedByLength);

        // Greatest Number

        List<Integer> numbers2 = Arrays.asList(3, 5, 7, 9, 6);
        int maxNumber = numbers.stream()
                .max(Integer::compareTo)  // find the maximum number
                .orElseThrow(NoSuchElementException::new); // Handle empty list case

        System.out.println(maxNumber);
    }
}
