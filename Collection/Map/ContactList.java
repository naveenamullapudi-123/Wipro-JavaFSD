import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        // Create HashMap with Generics
        HashMap<String, Integer> contacts = new HashMap<>();

        // Add contacts
        contacts.put("Rahul", 987654321);
        contacts.put("Anitha", 987654322);
        contacts.put("Kiran", 987654323);
        contacts.put("Suresh", 987654324);

        // a) Check if a particular key exists
        String name = "Rahul";

        if (contacts.containsKey(name)) {
            System.out.println("Key '" + name + "' exists.");
        } else {
            System.out.println("Key '" + name + "' does not exist.");
        }

        // b) Check if a particular value exists
        int phone = 987654323;

        if (contacts.containsValue(phone)) {
            System.out.println("Phone number " + phone + " exists.");
        } else {
            System.out.println("Phone number " + phone + " does not exist.");
        }

        // c) Iterate through the HashMap using Iterator
        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> iterator =
                contacts.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            System.out.println("Name : " + entry.getKey()
                    + "  Phone : " + entry.getValue());
        }
    }
}