import java.util.*;

public class SwapValue {
    public static void Swap(ArrayList<Integer> list, int idex1, int idex2) {
        int temp = list.get(idex1);
        list.set(idex1, list.get(idex2));
        list.set(idex2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(6);
        list.add(3);
        // int idex1 = 2;
        // int idex2 = 4;
        System.out.println(list);
        // Swap(list, idex1, idex2);
        // System.out.println(list);

        // to sort a arraylist
        // sort to ascending order
        Collections.sort(list);
        System.out.println(list);
        // sort to descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
