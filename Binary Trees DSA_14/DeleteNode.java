import java.util.*;

public class DeleteNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data <= k2 && root.data >= k1) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    // public static Node delete(Node root, int val) {
    // if (root.data > val) {
    // root.left = delete(root.left, val);
    // } else if (root.data < val) {
    // root.right = delete(root.right, val);
    // } else {
    // // no child
    // if (root.left == null && root.right == null) {
    // return null;
    // }

    // // one child
    // if (root.left == null) {
    // return root.right;
    // } else if (root.right == null) {
    // return root.left;
    // }

    // // two children

    // Node Is = findInorderSuccessor(root.right);
    // root.data = Is.data;
    // root.right = delete(root.right, Is.data);
    // }
    // return root;
    // }

    // public static Node findInorderSuccessor(Node root) {
    // while (root.left != null) {
    // root = root.left;
    // }
    // return root;
    // }
    public static void print(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void printPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            print(path);
        }
        printPath(root.left, path);
        printPath(root.right, path);
        path.remove(path.size() - 1);
    }
    // is valid bst
    public static boolean isValidBst(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if (isValidBst(root, null, null)) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
        // printInRange(root, 5, 12);
        // System.out.println();
        // root = delete(root, 2);
        // System.out.println();
        // inorder(root);
        // printPath(root, new ArrayList<>());
    }
}
