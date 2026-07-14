import java.util.TreeSet;
import java.util.Iterator;

public class CountryTreeSet {

    // Instance variable
    TreeSet<String> T1 = new TreeSet<>();

    // Method to add country names
    public TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }

    // Method to search for a country
    public String getCountry(String countryName) {
        Iterator<String> iterator = T1.iterator();

        while (iterator.hasNext()) {
            String country = iterator.next();
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    // Main method
    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println("Countries in TreeSet: " + obj.T1);

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