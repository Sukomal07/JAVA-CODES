import java.util.*;

public class Q7 {
    static void reverseKthElement(int arr[], int k) {
        int n = arr.length;
        Deque<Integer> dq = new LinkedList<>();
        int i;
        for (i = 0; i < k; ++i) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (;i < n; ++i) {
            System.out.print(arr[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1,4, 5, 2, 3, 6};
        int k = 3;
        reverseKthElement(arr, k);
    }
}
