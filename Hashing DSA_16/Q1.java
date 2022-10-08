import java.util.TreeMap;
public class Q1 {
    static class Node{
        int data; 
        int hd;
        Node left, right;
        public Node(int key){
            this.data = key;
            this.hd = Integer.MAX_VALUE;
            this.left = this.right = null;
        }
    }
    static void bottomViewOfTree(Node root , int curr , int hd , TreeMap<Integer , int[]> m){
        if(root == null){
            return;
        }
        if(!m.containsKey(hd)){
            m.put(hd, new int[]{root.data , curr} );
        }else{
            int[] p = m.get(hd);
            if(p[1] <= curr){
                p[1] = curr;
                p[0] = root.data;
            }
            m.put(hd,p);
        }
        bottomViewOfTree(root.left, curr+1, hd-1, m);
        bottomViewOfTree(root.right, curr+1, hd+1, m);
    }
    static void printbottomView(Node root){
        TreeMap<Integer , int[] > map = new TreeMap<>();
        bottomViewOfTree(root, 0, 0, map);
        for(int[] val : map.values()){
            System.out.print(val[0] + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        printbottomView(root);
    }
}
