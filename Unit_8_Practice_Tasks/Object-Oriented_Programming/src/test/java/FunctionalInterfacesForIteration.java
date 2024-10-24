import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfacesForIteration {

    public static void main(String[] args) {

         // (i) Consumer
        List<String> names = Arrays.asList("A", "B", "C");
        //Using consumer to print each name
        names.forEach(name -> {
            System.out.println("Hello," + name);
        });

        // (ii) Predicate
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Filtering even numbers using a loop
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        // (iii) Function
        List<String> names1 = Arrays.asList("a", "b", "c");
        //Converting names to UpperCase using Function
        List<String> upperCaseNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseNames);



        int a = 5;
        int b = a++;
        System.out.println(a);
        System.out.println(b);


        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n + 1)
                .forEach(n -> {
                    System.out.println(n);
                    System.out.println(n + 1);
                });


    }
}

