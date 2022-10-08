import java.util.HashMap;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 200);
        map.put("China", 100);
        map.put("Pakistan", 10);
        map.put("Usa", 60);
        map.put("Nepal", 50);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println(k);
        }
    }
}
