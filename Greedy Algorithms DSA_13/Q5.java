import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int count = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    amount = amount - coins[i];
                    ans.add(coins[i]);
                }
            }
        }
        System.out.println("minimum coin " + count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}