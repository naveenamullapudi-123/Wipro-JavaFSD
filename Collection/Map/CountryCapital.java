import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryCapital {

    // Instance variable M1
    HashMap<String, String> M1 = new HashMap<>();

    // 1. Save country and capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Get capital from country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Get country from capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Create reverse map (Capital -> Country)
    public HashMap<String, String> getReverseMap() {
        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // 5. Create ArrayList of country names
    public ArrayList<String> getCountryList() {
        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }

    // Main method
    public static void main(String[] args) {

        CountryCapital obj = new CountryCapital();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("France", "Paris");

        System.out.println("M1 Map:");
        System.out.println(obj.M1);

        System.out.println("\nCapital of India: " + obj.getCapital("India"));

        System.out.println("Country of Tokyo: " + obj.getCountry("Tokyo"));

        System.out.println("\nM2 Reverse Map:");
        System.out.println(obj.getReverseMap());

        System.out.println("\nCountry List:");
        System.out.println(obj.getCountryList());
    }
}