import java.util.HashMap;

public class Q5 {
    static HashMap<String, Integer> m = new HashMap<>();

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static String inorder(Node node) {
        if (node == null) {
            return "";
        }
        String str = "(";
        str += inorder(node.left);
        str += Integer.toString(node.data);
        str += inorder(node.right);
        str += ")";
        if (m.get(str) != null && m.get(str) == 1) {
            System.out.print(node.data + " ");
        } else {
            m.put(str, 1);
        }
        return str;
    }

    static void printAllDup(Node root) {
        m = new HashMap<>();
        inorder(root);
    }

    public static void main(String[] args) {
        Node root = null;
        root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        root.right.left.left = new Node(3);
        printAllDup(root);
    }
}
