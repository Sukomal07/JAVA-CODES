import java.util.ArrayList;
import java.util.Arrays;

public class GroupOfAnagram {
    static class Node {
        ArrayList<String> data;
        Node children[];
        boolean eow;

        public Node() {
            data = new ArrayList<>();
            children = new Node[26];
            eow = false;
        }
    }

    public static Node root = new Node();
    public static ArrayList<ArrayList<String>> ans = new ArrayList<>();

    public static ArrayList<ArrayList<String>> findAnagram(String word[]) {
        for (String w : word) {
            build(w);
        }
        dfs(root);
        return ans;
    }

    public static void build(String s) {
        Node curr = root;
        char word[] = s.toCharArray();
        Arrays.sort(word);
        for (char c : word) {
            Node child = curr.children[c - 'a'];
            if (child == null) {
                curr.children[c - 'a'] = new Node();
            }
            curr = curr.children[c - 'a'];
        }
        curr.eow = true;
        curr.data.add(s);
    }

    public static void dfs(Node root) {
        if (root.eow) {
            ans.add(root.data);
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                dfs(root.children[i]);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(findAnagram(words));

    }
}