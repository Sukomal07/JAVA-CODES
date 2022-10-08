import java.util.ArrayList;

public class Q1 {
    public static boolean monotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                dec = false;
            } else {
                inc = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(6);
        list.add(4);
        System.out.println(monotonic(list));
    }
}
