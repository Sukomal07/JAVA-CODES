import java.util.*;

public class priority {
    static class student implements Comparable<student> {
        int rank;
        String name;

        public student(int rank, String name) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student(2, "A"));
        pq.add(new student(10, "B"));
        pq.add(new student(3, "C"));
        pq.add(new student(1, "D"));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().rank + "->" + pq.peek().name);
            pq.remove();
        }
    }
}