public class Q6 {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }
    static class Res {
        public int val;
    }
    public static int findMaxUtil(Node root, Res res) {
        if (root == null) {
            return 0;
        }
        int l = findMaxUtil(root.left, res);
        int r = findMaxUtil(root.right, res);
        int MaxSingle = Math.max(Math.max(l, r) + root.data, root.data);
        int maxTop = Math.max(MaxSingle, l + r + root.data);
        res.val = Math.max(res.val, maxTop);
        return MaxSingle;
    }
    public static int findMaxSum(Node root) {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        findMaxUtil(root, res);
        return res.val;
    }

    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(findMaxSum(root));
    }
}
