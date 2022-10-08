import java.util.LinkedList;

public class Basic1 {
    public static void main(String[] args) {
        // create a linkedlist
        LinkedList<Integer> ll = new LinkedList<>();
        // add value to
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);
        
        // remove a value
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);

    }
}
