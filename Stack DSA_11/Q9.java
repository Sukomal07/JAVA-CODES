import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
public class Q9 {
    static boolean isPalin(Node head) {
        Node slow = head;
        boolean isPalin = true;
        Stack<Integer> s = new Stack<Integer>();
        while (slow != null) {
            s.push(slow.data);
            slow = slow.next;
        }
        while (head != null) {
            int i = s.pop();
            if (head.data == i) {
                isPalin = true;
            } else {
                isPalin = false;
                break;
            }
            head = head.next;
        }
        return isPalin;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(2);
        Node five = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        boolean condition = isPalin(four);
        System.out.println(condition);
    }
}

