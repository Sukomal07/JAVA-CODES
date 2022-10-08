public class Q1 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static class Tree {
        public static int idx = -1;

        public static Node binaryTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = binaryTree(nodes);
            newNode.right = binaryTree(nodes);
            return newNode;
        }
    }

    public static boolean isUnivalued(Node root) {
        if (root == null) {
            return true;
        }
        // boolean leftNode = isUnivalued(root.left);
        // boolean rightNode = isUnivalued(root.right);
        // if (leftNode) {
        // return false;
        // }
        // if (rightNode) {
        // return false;
        // }
        if (root.left != null && root.left.data != root.data) {
            return false;
        } else if (root.right != null && root.data != root.right.data) {
            return false;
        }
        return isUnivalued(root.left) && isUnivalued(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right.right = new Node(2);
        if (isUnivalued(root)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
