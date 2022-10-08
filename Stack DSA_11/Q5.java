import java.util.Stack;
// find next greater element in right
public class Q5 {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
// time complexity always remain - O(n) for every variation of this question
// next greater on left - simple change the loop for(0 to length-1) and remaning part will same
// next smaller on right - change arr[s.peek()] >= arr[i] and remaning part will same
// next smaller on left - change loop for(0 to length -1 ) and change (arr[s.peek()] >= arr[i]) and remaning part will same
