public class Q4 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void evenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;
        while (end.next != null) {
            end = end.next;
        }
        Node newEnd = end;
        while (curr.data % 2 != 0 && curr != end) {
            newEnd.next = curr;
            curr = curr.next;
            newEnd.next.next = null;
            newEnd = newEnd.next;
        }
        if (curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    newEnd.next = curr;
                    newEnd = curr;
                    curr = prev.next;
                }
            }
        } else {
            prev = curr;
        }
        if (newEnd != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            newEnd.next = end;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
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
        Q4 ll = new Q4();
        ll.push(4);
        ll.push(8);
        ll.push(12);
        ll.push(10);
        ll.push(5);
        ll.push(7);
        ll.push(6);
        ll.push(1);
        System.out.println("Linked list");
        ll.print();
        ll.evenOdd();
        System.out.println("Updated linkedList");
        ll.print();
    }
}
