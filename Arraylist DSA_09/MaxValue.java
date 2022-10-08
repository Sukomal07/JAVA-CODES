import java.util.*;

public class MaxValue {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(11);
        List.add(27);
        List.add(36);
        List.add(47);
        System.out.println(List);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < List.size(); i++) {
            max = Math.max(max, List.get(i));
        }
        System.out.println("maximum value is "+max);
    }
}
// time comp -O(n)
