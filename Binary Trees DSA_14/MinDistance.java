public class MinDistance {
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

        public static Node buidTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buidTree(nodes);
            newNode.right = buidTree(nodes);
            return newNode;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);
        if (leftLca == null) {
            return rightLca;
        } else if (rightLca == null) {
            return leftLca;
        }
        return root;
    }

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        } else if (root.data == n) {
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int righDist = lcaDist(root.right, n);

        if (leftDist == -1 && righDist == -1) {
            return -1;
        }
        if (leftDist == -1) {
            return righDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public static int minDistance(Node root, int n1, int n2) { //O(n)
        Node lca2 = lca(root, n1, n2);
        int dist1 = lcaDist(lca2, n1);
        int dist2 = lcaDist(lca2, n2);
        return dist1 + dist2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4;
        int n2 = 6;
        System.out.println("Min distance between two nodes " + minDistance(root, n1, n2));
    }
}
