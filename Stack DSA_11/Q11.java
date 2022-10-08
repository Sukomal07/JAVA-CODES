import java.util.Stack;

public class Q11 {
    public static int maxWater(int height[]) {
        Stack<Integer> s = new Stack<>();
        int water = 0;
        for (int curr = 0; curr < height.length; curr++) {
            while (!s.isEmpty() && (height[s.peek()] < height[curr])) {
                int popHeight = height[s.peek()];
                s.pop();
                if (s.isEmpty()) {
                    break;
                }
                int distance = curr - s.peek() - 1;
                int waterFill = Math.min(height[s.peek()], height[curr] - popHeight);
                water +=distance* waterFill;
            }
            s.push(curr);
        }
        return water;
    }

    public static void main(String[] args) {
        int height[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 6 };
        System.out.println(maxWater(height));
    }
}
