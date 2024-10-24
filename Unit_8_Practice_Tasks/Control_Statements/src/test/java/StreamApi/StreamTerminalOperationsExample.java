package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class StreamTerminalOperationsExample {
    public static void main (String[] args){
        // Sample Data
        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
        );

        // forEach: Print each name
        System.out.println("forEach: ");
        names.stream().forEach(System.out::println);

        // Collect: collect names starting with "S" into a list
        List<String> sNames = names.stream()
                .filter(name -> name.startsWith("S"))
                .toList();
        System.out.println("\nCollect (names starting with 'S'):");
        sNames.forEach(System.out::println);

        // reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream().reduce("", (partialString, element) -> partialString + " " + element);

        System.out.println("\nReduce (Concatenated names):");
        System.out.println(concatenatedNames);

        // count: Count the number of names
        long count = names.size();
        System.out.println("\nCount Sample Data (names):");
        System.out.println(count);

        //  findFirst : Find the First Name
        Optional<String> firstName = names.stream().findFirst();
        System.out.println("\nfindFirst: ");
        firstName.ifPresent(System.out::println);

        // allMatch: Check if all names start with 'S'
        boolean allStartWithS = names.stream().allMatch(name -> name.startsWith("S"));
        System.out.println("\nAll Natch (all start with 'S'):");
        System.out.println(allStartWithS);

        // anyMatch: Check if any name starts with 'S'
        boolean anyStartWithS = names.stream().anyMatch(name -> name.startsWith("S"));

        System.out.println("\nanyMatch 90any start with 'S':");
        System.out.println(anyStartWithS);

    }

}
