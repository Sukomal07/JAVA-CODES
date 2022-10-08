public class Q8 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int minDiff;
    static int minDiffKey;

    static void maxDiff(Node root, int k) {
        if (root == null) {
            return;
        }
        if (root.data == k) {
            minDiffKey = k;
            return;
        }
        if (minDiff > Math.abs(root.data - k)) {
            minDiff = Math.abs(root.data - k);
            minDiffKey = root.data;
        }
        if (k < root.data) {
            maxDiff(root.left, k);
        } else {
            maxDiff(root.right, k);
        }
    }

    static int maxdif(Node root, int data) {
        minDiff = 999999999;
        minDiffKey = -1;
        maxDiff(root, data);
        return minDiffKey;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);
        int k = 19;
        System.out.println(maxdif(root, k));

    }
}
