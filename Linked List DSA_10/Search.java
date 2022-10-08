public class Search {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head; // link
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() { 
        if (head == null) {
            System.out.println("ll is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int itrSearch(int key) {// O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // if key not found
        return -1;
    }

    public int helper(Node head, int key) { //O(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    // recursion func
    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        Search linkList = new Search();
        linkList.addFirst(2);
        linkList.addFirst(1);
        linkList.addLast(3);
        linkList.addLast(4);
        linkList.addLast(5);
        linkList.print();
        System.out.println(linkList.itrSearch(4));
        System.out.println(linkList.itrSearch(10));
        System.out.println(linkList.recSearch(3));
        System.out.println(linkList.recSearch(6));
    }
}
