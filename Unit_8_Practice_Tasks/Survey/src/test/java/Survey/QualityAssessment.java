package Survey;

import java.util.ArrayList;
import java.util.List;

public class QualityAssessment {
    public static void main(String[] args){

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        System.out.println(numbers);
        numbers.stream().filter(item -> item%2 == 0).forEach(System.out::println);

    }
}
