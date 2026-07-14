import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // Creating HashMap
        HashMap<String, String> map = new HashMap<>();

        // Adding elements
        map.put("101", "Alice");
        map.put("102", "Bob");
        map.put("103", "Charlie");
        map.put("104", "David");

        // a) Check if a particular key exists
        String key = "102";
        if (map.containsKey(key)) {
            System.out.println("Key " + key + " exists.");
        } else {
            System.out.println("Key " + key + " does not exist.");
        }

        // b) Check if a particular value exists
        String value = "Charlie";
        if (map.containsValue(value)) {
            System.out.println("Value " + value + " exists.");
        } else {
            System.out.println("Value " + value + " does not exist.");
        }

        // c) Iterate through the HashMap using Iterator
        System.out.println("\nElements in HashMap:");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() +
                               ", Value = " + entry.getValue());
        }
    }
}