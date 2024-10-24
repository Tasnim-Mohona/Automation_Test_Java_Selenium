package ControlStatements;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SurveyCollection {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Blue");
        set.add("Yellow");
        set.add("Blue");

        System.out.println(set);
        System.out.println(set.size());

        HashMap<String, String> colours = new HashMap<>();

        colours.put("C1", "Blue");
        colours.put("C1", "Red");
        colours.put("C2", "Blue");


        System.out.println(colours);
        System.out.println(colours.size());

//        InfiniteMethod(1, 2, 3, 4, 6);
    }

    public static void InfiniteMethod(String name, int... numbers) {
        for (int number : numbers) {
            System.out.println(number + "");
        }
    }
}
