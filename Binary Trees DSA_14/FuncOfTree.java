public class FuncOfTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.max(lh, rh)) + 1;
    }

    // count of nodes
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        return (lc + rc) + 1;
    }

    // sum of nodes

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return (leftSum + rightSum) + root.data;
    }

    // diameter of tree
    // approach 1
    public static int calculateDiam(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }
        int leftDiam = calculateDiam(root.left);
        int rightDiam = calculateDiam(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDiam = (leftHeight + rightHeight) + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    // approach 2
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info righInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, righInfo.diam), (leftInfo.ht + righInfo.ht) + 1);
        int ht = Math.max(leftInfo.ht, righInfo.ht) + 1;
        return new Info(diam, ht);
    }

    // subtree of another tree
    // check is my tree subroot data and my subroot data is same
    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        } else if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    // check is my tree subroot and subroot root is same
    public static boolean isSubRoot(Node root, Node subRoot) {
        if(root == null){
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubRoot(root.left, subRoot) || isSubRoot(root.right, subRoot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);


        System.out.println("Height of tree " + height(root));
        System.out.println("Count of nodes " + countNodes(root));
        System.out.println("Sum of nodes " + sumOfNodes(root));
        System.out.println("Total diameter " + calculateDiam(root));
        System.out.println("Total diameter " + diameter(root).diam);

        System.out.println(isSubRoot(root, subRoot));
    }
}
