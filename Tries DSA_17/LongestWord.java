public class LongestWord {
    static class Node {
        char data;
        String word;
        boolean eow;
        Node children[];

        public Node(char data) {
            this.data = data;
            this.word = null;
            this.eow = false;
            this.children = new Node[26];
        }
    }

    public static Node root = new Node('/');
    public static String ans = "";

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int childIdx = word.charAt(i) - 'a';
            if (curr.children[childIdx] == null) {
                curr.children[childIdx] = new Node(word.charAt(i));
            }
            curr = curr.children[childIdx];
        }
        curr.eow = true;
        curr.word = word;
    }

    public static void dfs(Node root) {
        if (root == null) {
            return;
        }
        if (root.word != null) {
            if (root.word.length() > ans.length()) {
                ans = root.word;
            } else if (root.word.length() == ans.length() && root.word.compareTo(ans) < 0) {
                ans = root.word;
            }
        }
        for (Node child : root.children) {
            if (child != null && child.word != null) {
                dfs(child);
            }
        }
    }

    public static String longestWord(String words[]) {
        for (String w : words) {
            insert(w);
        }
        Node curr = root;
        dfs(curr);
        return ans;
    }

    public static void main(String[] args) {
        String words[] = { "w", "wo", "wor", "worl", "world" };
        System.out.println(longestWord(words));
    }
}
