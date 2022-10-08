public class Q4 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node deleteNodes(Node root, int x) {
        if (root == null) {
            return null;
        }
        root.left = deleteNodes(root.left, x);
        root.right = deleteNodes(root.right, x);
        if (root.data == x && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        deleteNodes(root, 3);
        System.out.println("After deletion ");
        inorder(root);
    }
}
