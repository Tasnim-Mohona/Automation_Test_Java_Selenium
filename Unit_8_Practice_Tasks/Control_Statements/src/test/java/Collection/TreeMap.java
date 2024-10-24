package Collection;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args){

        // Creating a map using TreeMap
        Map<String, Integer> values = new java.util.TreeMap<>();

        // Insert  elements to map
        values.put("Second", 2);
        values.put("First", 1);
//        values.put("First", 3);
        System.out.println("Map using TreeMap: " + values);

        // Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);

        // Remove elements from the Map
        int removedValue = values.remove("First");
        System.out.println("Removed Values:"+ removedValue);


    }
}
