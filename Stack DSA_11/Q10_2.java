import java.util.Stack;

public class Q10_2 {
    static String simplefy(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String p[] = path.split("/");
        for (int i = 0; i < p.length; i++) {
            // for ..
            if (!s.isEmpty() && p[i].equals("..")) {
                s.pop();
            } else if (!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")) {
                s.push(p[i]);
            }
        }
        if (s.isEmpty()) {
            return "/";
        }
        while (!s.isEmpty()) {
            res.insert(0, s.pop()).insert(0, "/");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        // String path = new String("/a/./b/../../c/");
        String path = new String("/java codes /");
        String ans = simplefy(path);
        System.out.println(ans);
    }
}