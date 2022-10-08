import java.util.*;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        // ArrayList<String> List2 = new ArrayList<>();
        // ArrayList<Boolean> List3 = new ArrayList<>();
        // add element
        // time complexity O(1)
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);

        List.add(2, 9);
        System.out.println(List);
        System.out.println(List.size());
        // print the arraylist
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + " ");
        }
        System.out.println();

        // get a element
        // time complexity -O(1)
        int element = List.get(2);
        System.out.println(element);

        // remove an element
        // time complexity O(n)
        List.remove(2);
        System.out.println(List);
        // st an element
        List.set(2, 10);
        System.out.println(List);
        // time comp -O(n)

        // containes element
        System.out.println(List.contains(1));
        System.out.println(List.contains(11));

    }
}