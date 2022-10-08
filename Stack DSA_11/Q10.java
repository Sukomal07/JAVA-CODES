import java.util.Stack;

public class Q10 {
    static String simplify(String A) {
        Stack<String> st = new Stack<>();
        String res = "";
        res += "/";
        int lenA = A.length();
        for (int i = 0; i < lenA; i++) {
            String dir = "";
            while (i < lenA && A.charAt(i) == '/') {
                i++;
            }
            while (i < lenA && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }
            if (dir.equals("..") == true) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (dir.equals(".") == true) {
                continue;
            } else if (dir.length() != 0) {
                st.push(dir);
            }
        }
        Stack<String> s = new Stack<>();
        while (!s.isEmpty()) {
            if (s.size() != 1) {
                res += (s.pop() + "/");
            } else {
                res += s.pop();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = new String("/a/./b/../.././c/");
        String res = simplify(str);
        System.out.println(res);
    }
}
