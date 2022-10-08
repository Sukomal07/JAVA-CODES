import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetCode {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        TreeSet<Integer> set3 = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(2);
        set2.add(1);
        System.out.println(set2);

        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(2);
        set3.add(1);
        System.out.println(set3);
    }
}
