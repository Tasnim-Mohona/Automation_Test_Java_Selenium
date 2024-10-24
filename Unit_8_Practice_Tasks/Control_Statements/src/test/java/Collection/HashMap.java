package Collection;

import java.util.Map;

public class HashMap {
    public static void main(String[] args){
        // Creating a map using the HasMap
        Map<String, Integer> numbers = new java.util.HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Two", 3);
        System.out.println("Map" + numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());
        // Remove elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);
    }
}
