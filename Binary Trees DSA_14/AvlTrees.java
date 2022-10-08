public class AvlTrees {
    static class Node {
        int data;
        int heigth;
        Node left, right;

        Node(int data) {
            this.data = data;
            heigth = 1;
        }
    }

    public static Node root;

    public static int heigth(Node root) {
        if (root == null) {
            return 0;
        }
        return root.heigth;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int getBalenced(Node root) {
        if (root == null) {
            return 0;
        }
        return heigth(root.left) - heigth(root.right);
    }

    // left rotated subtree rotated with x
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node t2 = y.left;

        // perform rotation
        y.left = x;
        x.right = t2;

        // update height
        x.heigth = max(heigth(x.left), heigth(x.right)) + 1;
        y.heigth = max(heigth(y.left), heigth(y.right)) + 1;

        // return new root
        return y;
    }

    // right rotate subtree rotated with y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node t2 = x.right;

        // rotation perform
        x.right = y;
        y.left = t2;

        // update height
        y.heigth = max(heigth(y.left), heigth(y.right)) + 1;
        x.heigth = max(heigth(x.left), heigth(x.right)) + 1;

        // returned new root
        return x;
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root; // duplicate keys is not allowed
        }
        // update root height
        root.heigth = 1 + Math.max(heigth(root.left), heigth(root.right));
        // get root's balence factor
        int bf = getBalenced(root);
        // left left case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // right right case
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // left right case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // right left case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root; // returned if avl balenced

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
        preorder(root);
    }
}
