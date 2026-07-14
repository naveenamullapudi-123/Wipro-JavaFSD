import java.util.HashSet;
import java.util.Iterator;

public class Country {

    // Instance variable
    HashSet<String> H1 = new HashSet<>();

    // Method to add country names
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // Method to search for a country
    public String getCountry(String countryName) {
        Iterator<String> it = H1.iterator();

        while (it.hasNext()) {
            String country = it.next();
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    // Main method
    public static void main(String[] args) {

        Country obj = new Country();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println("Countries in HashSet: " + obj.H1);

        String result = obj.getCountry("India");
        if (result != null) {
            System.out.println("Country Found: " + result);
        } else {
            System.out.println("Country Not Found");
        }

        result = obj.getCountry("Canada");
        if (result != null) {
            System.out.println("Country Found: " + result);
        } else {
            System.out.println("Country Not Found");
        }
    }
}