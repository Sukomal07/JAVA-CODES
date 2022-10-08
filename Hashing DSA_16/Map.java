import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        LinkedHashMap<String , Integer> map2 = new LinkedHashMap<>();
        TreeMap<String , Integer> map3 = new TreeMap<>();

        //insert - O(1)
        map.put("India", 200);
        map.put("China", 100);
        map.put("Pakistan", 10);
        map.put("Usa", 60);

        System.out.println(map);

        map2.put("India", 200);
        map2.put("China", 100);
        map2.put("Pakistan", 10);
        map2.put("Usa", 60);

        System.out.println(map2);

        map3.put("D", 200);
        map3.put("C", 100);
        map3.put("B", 10);
        map3.put("A", 60);

        System.out.println(map3);

        // get O(1)
        int pop = map.get("India");
        System.out.println("pop "+pop);

        // containeskey O(1)
        System.out.println(map.containsKey("Usa"));

        // remove -O(1)
        System.out.println(map.remove("Pakistan"));
        System.out.println(map);

        // size
        System.out.println(map.size());

        // isEmpty
        System.out.println(map.isEmpty());

        map.clear();
        System.out.println(map.isEmpty());
    }
}