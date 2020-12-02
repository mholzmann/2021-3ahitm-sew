package at.htl.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(":)", "🙂");
        map.put(";)", "😉");
        map.put(":(", "🙁");

        // Search the value mapped to the key ":)"
        String value = map.get(":)");   // returns "🙂"
        System.out.println(value);

        // Search the value mapped to the key ":D"
        value = map.get(":D");          // returns null, because key is not contained
        System.out.println(value);

        // Search again the value mapped to the key ":D", but provide a default value this time
        value = map.getOrDefault(":D", "😎");    // returns the default value "😎", because the key is not contained
        System.out.println(value);

        // Check whether the map contains the key ":D"
        boolean containsKey = map.containsKey(":D");
        System.out.println("containsKey(\":D\") -> false");

        // Get a set of all keys, the map contains
        Set<String> keys = map.keySet();
        System.out.println("keysSet() -> " + keys);
        System.out.println("keySet() returns a " + keys.getClass().getName());
    }
}
