import java.util.ArrayList;

public class Lca {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static class Tree {
        static int idx = -1;

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

    // approach 1
    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getpath(root.left, n, path);
        boolean foundRight = getpath(root.right, n, path);
        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) { // O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);

        // last common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // last equal node (i-1)
        Node lca = path1.get(i - 1);
        return lca;
    }

    // approach 2
    public static Node laca2(Node root, int n1, int n2) { // O(n)
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlca = laca2(root.left, n1, n2);
        Node rightlca = laca2(root.right, n1, n2);
        if (leftlca == null) {
            return rightlca;
        } else if (rightlca == null) {
            return leftlca;
        }
        return root;
    }

    public static int KthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = KthAncestor(root.left, n, k);
        int righDist = KthAncestor(root.right, n, k);

        if (leftDist == -1 && righDist == -1) {
            return -1;
        }
        int max = Math.max(leftDist, righDist);
        if (max + 1 == k) {
            System.out.println("Kth ancestor "+root.data);
        }
        return max + 1;
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
        System.out.println(lca(root, n1, n2).data);
        System.out.println(laca2(root, n1, n2).data);
        int n = 5, k = 2;
        KthAncestor(root, n, k);
    }
}
