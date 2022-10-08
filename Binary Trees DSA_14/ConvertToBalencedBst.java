import java.util.*;

public class ConvertToBalencedBst {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBst(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBst(inorder, st, mid - 1);
        root.right = createBst(inorder, mid + 1, end);
        return root;
    }

    public static Node convertToBalenced(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        // sorted array
        getInorder(root, inorder);
        // sorted to balenced bst
        root = createBst(inorder, 0, inorder.size() - 1);
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.right.right.right = new Node(12);
        root = convertToBalenced(root);
        preorder(root);
    }
}
