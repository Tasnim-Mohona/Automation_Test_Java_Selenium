package Collection;

import java.util.List;

public class ArrayList {
    public static void main (String[] args){
        //  create an array list, add
        //  some colors (strings) and print out the collection.
        List<String> listStrings = new java.util.ArrayList<>();
        listStrings.add("Red");
        listStrings.add("Krasnyy");
        listStrings.add("Blue");
        listStrings.add("Sinyy");
        listStrings.add("Neel");
        System.out.println(listStrings);

        //iterate through all elements in an array list
        for (String element : listStrings) {
            System.out.println(element);
        }

            //insert an element into the array list
            // at the first and last position
        listStrings.add(0, "Black");
        listStrings.add(5,"Yellow");
        System.out.println(listStrings);

        java.util.ArrayList<String> animals = new java.util.ArrayList<>();
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("ArrayList: " + animals);

    }
}
