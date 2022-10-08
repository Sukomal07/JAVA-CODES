import java.util.ArrayList;

public class Stack {
    static class stackB {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }
        // push

        public static void push(int data) {
            list.add(data);
        }
        // pop

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int pop = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return pop;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        stackB.push(1);
        stackB.push(2);
        stackB.push(3);

        while (!stackB.isEmpty()) {
            System.out.println(stackB.peek());
            stackB.pop();
        }
    }
}