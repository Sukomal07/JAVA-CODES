import java.util.HashSet;
// import java.util.Iterator;

public class IterationOnSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Kolkata");
        cities.add("Khargapur");
        cities.add("Mednipur");
        cities.add("Bangalore");
        // Iterator i = cities.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
