import java.util.*;

public class Q1 { // O(n)
    public static void nonRepeating(String str) {
        int count[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            count[ch - 'a']++;
            while (!q.isEmpty() && count[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.println(-1+" ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        nonRepeating(str);
    }
}
