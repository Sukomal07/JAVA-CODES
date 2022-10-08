import java.util.*;

public class Q5 {
    static int connectRopes(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int ans = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            ans += first + second;
            pq.add(first + second);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6 };
        System.out.println(connectRopes(arr, 4));
    }
}
