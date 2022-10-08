public class Q11 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class info {
        int max, min;
        boolean isBst;
        int sum, currMax;

        info(int min, int max, boolean isBst, int sum, int currMax) {
            this.max = max;
            this.min = min;
            this.isBst = isBst;
            this.sum = sum;
            this.currMax = currMax;
        }

        info() {
        }
    }

    static class INT {
        int a;
    }

    static info maxSumBstUtil(Node root, INT maxSum) {
        if (root == null) {
            return new info(Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0, 0);
        }
        if (root.left == null && root.right == null) {
            maxSum.a = Math.max(maxSum.a, root.data);
            return new info(root.data, root.data, true, root.data, maxSum.a);
        }
        info L = maxSumBstUtil(root.left, maxSum);
        info R = maxSumBstUtil(root.right, maxSum);
        info BST = new info();
        if (L.isBst && R.isBst && L.max < root.data && R.min > root.data) {
            BST.max = Math.min(root.data, Math.max(L.max, R.max));
            BST.min = Math.min(root.data, Math.min(L.min, R.min));
            maxSum.a = Math.max(maxSum.a, R.sum + root.data + L.sum);
            BST.sum = R.sum + root.data + L.sum;
            BST.currMax = maxSum.a;
            BST.isBst = true;
            return BST;
        }
        BST.isBst = false;
        BST.currMax = maxSum.a;
        BST.sum = R.sum + root.data + L.sum;
        return BST;
    }

    static int maxSumBst(Node root) {
        INT maxSum = new INT();
        maxSum.a = Integer.MIN_VALUE;
        return maxSumBstUtil(root, maxSum).currMax;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(14);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(1);
        System.out.println(maxSumBst(root));
    }
}
