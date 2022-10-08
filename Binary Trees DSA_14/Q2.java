public class Q2 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void swap(Node curr){
        if(curr == null){
            return;
        }
        swap(curr.left);
        swap(curr.right);
        Node temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;
    }
    public static int inverted(Node root){
        swap(root);
        return root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(inverted(root));
    }
}
