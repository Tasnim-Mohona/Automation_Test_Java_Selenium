package Collection;

import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {
        // Create Hashmap object capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add Keys and Values (Country, City)
        capitalCities.put("Bangladesh", "Dhaka");
        capitalCities.put("India", "Delhi");
        capitalCities.put("Russia", "Moscow");
        System.out.println(capitalCities);

        // access an item
        capitalCities.get("Bangladesh");

        // remove an item
        capitalCities.remove("India");

        //remove all items
        capitalCities.clear();

        //size
        capitalCities.size();

        // Loop Through a HashMap
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 29);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }


}

