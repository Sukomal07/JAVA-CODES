import java.util.LinkedList;
import java.util.Queue;

public class Q7 {
    static class Node {
        int data;
        Node left, right;
    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    static int sum = 0;

    static int rangeSumBst(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty() == false) {
            Node curr = q.peek();
            q.remove();
            if (curr.data >= low && curr.data <= high) {
                sum += curr.data;
            }
            if (curr.left != null && curr.data > low) {
                q.add(curr.left);
            }
            if (curr.right != null && curr.data < high) {
                q.add(curr.right);
            }
        }
        return sum;
    }

    static Node insert(Node root, int data) {
        if (root == null) {
            return newNode(data);
        }
        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 10);
        insert(root, 5);
        insert(root, 15);
        insert(root, 3);
        insert(root, 7);
        insert(root, 18);
        int l = 7, r = 15;
        System.out.println(rangeSumBst(root, l, r));
    }
}
