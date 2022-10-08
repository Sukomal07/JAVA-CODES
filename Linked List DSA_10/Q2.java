public class Q2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node push(Node headref, int newdata) {
        Node newNode = new Node(newdata);
        newNode.data = newdata;
        newNode.next = (headref);
        (headref) = newNode;
        return headref;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void skipNodes(Node head, int m, int n) {
        Node curr = head, x;
        int count;
        while (curr != null) {
            for (count = 1; count < m && curr != null; count++) {
                curr = curr.next;
            }
            if (curr == null) {
                return;
            }
            x = curr.next;
            for (count = 1; count <= n && x != null; count++) {
                // Node temp = x;
                x = x.next;
            }
            curr.next = x;
            curr = x;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        int m = 2;
        int n = 2;
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        System.out.printf("M = %d, N = %d \n" + "Linked list we have is :\n", m, n);
        print(head);
        skipNodes(head, m, n);
        System.out.println("linked list after deletion ");
        print(head);
    }
}
