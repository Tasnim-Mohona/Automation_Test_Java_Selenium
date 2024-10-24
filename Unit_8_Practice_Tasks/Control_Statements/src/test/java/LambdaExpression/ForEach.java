package LambdaExpression;

import java.util.ArrayList;

public class ForEach {

    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<
                Integer>();
        numbers.add(5);
        numbers.add(9);
//        Integer i = numbers.get(0);

        numbers.forEach(System.out::println);
//        numbers.forEach((n) -> {System.out.println(n)});
    }


}
