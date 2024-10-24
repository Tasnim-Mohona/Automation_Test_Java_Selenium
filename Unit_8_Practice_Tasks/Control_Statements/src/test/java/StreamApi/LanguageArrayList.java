package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LanguageArrayList {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("German");
        languages.add("French");

        System.out.println(languages);
        // Using For Loop
        for (String language : languages){
            System.out.println("Languages in Array List: " + language);
        }

        languages.stream().forEach(System.out::println);

        // stream.filter()
        languages.stream().filter(item -> item.startsWith("E")).forEach(System.out::println);

        // stream.sort()
        languages.stream().sorted().forEach(System.out::println);

        // stream.ma[()
        languages.stream().map(item -> item.toUpperCase()).forEach(System.out::println);

        // stream.collect()
        List<String> UpperCaselanguage  = languages.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());
        System.out.println(UpperCaselanguage);

        // stream.count()
        long count = languages.stream().filter(item -> item.startsWith("G")).count();
        System.out.println(count);

        // stream.min() &  max()
        // Getting Maximum Number
        Integer maximum = Stream.of(10, 13, 4, 9, 2, 100).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max number is: " + maximum);

        // Getting Minimum Number
        Integer minimum = Stream.of(10, 13,15, 100).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.print("Minimum Number: " + minimum);
    }
}
