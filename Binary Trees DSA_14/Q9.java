public class Q9 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static int count = 0;

    public static Node kthSmallest(Node root, int k) {
        if (root == null) {
            return null;
        }
        Node left = kthSmallest(root.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if (count == k) {
            return root;
        }
        return kthSmallest(root.right, k);
    }

    public static void print(Node root, int k) {
        Node res = kthSmallest(root, k);
        if (res == null) {
            System.out.println("There are less than k nodes in the Bst");
        } else {
            System.out.println("kth smallest element is " + res.data);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int keys[] = { 8,5,3,6,11,20 };
        for (int data : keys) {
            root = insert(root, data);
        }
        int k = 3;
        print(root, k);
    }
}
