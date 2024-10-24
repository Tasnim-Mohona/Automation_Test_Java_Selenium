package StreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamIntermediateOperationsExample {
    public static void main(String[] args00){
        // List of List of names
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        // Create a set to hold Intermediate Result
        Set<String> intermediateResults = new HashSet<>();

        // Stream Pipeline with intermediate Operation

        List<String>  result = listOfLists.stream()
                .flatMap(List::stream)
                .filter(s -> s.startsWith("S"))
                .map(String :: toUpperCase)
                .distinct()
                .sorted()
                .peek(intermediateResults::add)  // Method Reference
//                .peek(s-> intermediateResults.add(s)) // Lambda
                .toList();
        // Print Intermediate Results
        System.out.println("Intermediate Results");
        intermediateResults.forEach(System.out::println);

        // Print the final result
        System.out.println("Final Result:");
        result.forEach(System.out::println);
    }
}
