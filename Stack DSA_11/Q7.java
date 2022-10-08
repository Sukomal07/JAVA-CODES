import java.util.Stack;

// time complexity - O(n)
public class Q7 {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing pair
            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) { // duplicate pair
                    return true;
                }
            } else { // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b) + (c+d))";
        System.out.println(isValid(str));
    }
}
