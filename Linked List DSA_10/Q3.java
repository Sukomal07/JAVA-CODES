public class Q3 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void swapNodes(int x, int y) {
        if (x == y) {
            return;
        }
        Node prevx = null, currx = head;
        while (currx != null && currx.data != x) {
            prevx = currx;
            currx = currx.next;
        }
        Node prevy = null, curry = head;
        while (curry != null && curry.data != y) {
            prevy = curry;
            curry = curry.next;
        }
        if (currx == null || curry == null) {
            return;
        }
        if (prevx != null) {
            prevx.next = curry;
        } else {
            head = curry;
        }
        if (prevy != null) {
            prevy.next = currx;
        } else {
            head = currx;
        }
        Node temp = currx.next;
        currx.next = curry.next;
        curry.next = temp;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q3 ll = new Q3();
        ll.push(7);
        ll.push(6);
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        System.out.println("Linked list before");
        ll.print();
        ll.swapNodes(3, 6);
        System.out.println("after");
        ll.print();
    }
}

