import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Map;

public class PropertiesDemo {

    public static void main(String[] args) {

        // Create Properties object
        Properties states = new Properties();

        // Add State and Capital
        states.setProperty("Andhra Pradesh", "Amaravati");
        states.setProperty("Telangana", "Hyderabad");
        states.setProperty("Karnataka", "Bengaluru");
        states.setProperty("Tamil Nadu", "Chennai");
        states.setProperty("Maharashtra", "Mumbai");

        // Iterate using Iterator
        Set<Map.Entry<Object, Object>> entries = states.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();

        System.out.println("States and their Capitals:");

        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}