import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        System.out.println(List);
        for (int i = List.size() - 1; i >= 0; i--) {
            System.out.print(List.get(i)+" ");
        }
        System.out.println();
    }
}
// time comp-O(n)
