import java.util.ArrayList;
import java.util.PriorityQueue;

public class KthLargestElement {
    static PriorityQueue<Integer> min;
    static int k;

    static ArrayList<Integer> getKthNumber(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : arr) {
            if (min.size() < k) {
                min.add(val);
            } else {
                if (val > min.peek()) {
                    min.poll();
                    min.add(val);
                }
            }
            if (min.size() >= k) {
                list.add(min.peek());
            } else {
                list.add(-1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 11, 70, 50, 40, 100, 5 };
        k = 3;
        min = new PriorityQueue<>();
        ArrayList<Integer> res = getKthNumber(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
