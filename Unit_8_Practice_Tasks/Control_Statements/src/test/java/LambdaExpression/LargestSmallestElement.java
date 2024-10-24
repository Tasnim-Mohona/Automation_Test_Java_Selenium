package LambdaExpression;

import java.util.Arrays;
import java.util.Comparator;

public class LargestSmallestElement {
    public static void main(String[] args) {
        // Create an array of integers

        Integer[] nums = {1, 7, 18, 5};
        System.out.println("Array elements: " + Arrays.deepToString(nums));

        // Find the second largest element using Lambda expression

        Integer secondLargest = Arrays.stream(nums).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        // Find the second smallest element
        Integer secondSmallest = Arrays.stream(nums).distinct().sorted().skip(1).findFirst().orElse(null);

        System.out.println(secondLargest);
        System.out.println(secondSmallest);
    }
}

