package Survey;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class Survey1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 6);
        numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

        int ourInt = 5;
        double d = ourInt;
        System.out.println(d);

        double z = 10.89;
        int a = (int) z;
        System.out.println(a);

        boolean hasSecurityClearance = true;
        boolean knowsPassword = false;
        if (hasSecurityClearance || knowsPassword) {
            System.out.println("User has access.");
        } else {
            System.out.println("Access denied.");
        }

        int a1 = 3;
        int b = 0;
        try {
            System.out.println(a1 / b);
        } catch (ArithmeticException e) {  // Fixed: Use ArithmeticException instead of PrintException
            throw new ArithmeticException(e.getMessage());
        }

        try {
            FileReader fileReader = new FileReader("C:");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }

        // for (Integer number : numbers)
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        int index = 0;

        // This condition will never be true since index is 0 and numbers.size() is 3
        if (index > numbers.size()) {  // Redundant code
            System.out.println(numbers.get(index));
        }

        // Similarly, this loop will not execute due to index being 0
        while (index > numbers.size()) {  // Redundant code
            System.out.println(numbers.get(index));
            index++;
        }

        int index1 = 0;
        do {
            System.out.println(numbers.get(index1));
            index1++;
        }
        // Fixed: Change the condition to avoid accessing beyond list size
        while (index1 < numbers.size());
    }
}
