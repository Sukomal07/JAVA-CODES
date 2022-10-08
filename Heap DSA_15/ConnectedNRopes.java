import java.util.PriorityQueue;

public class ConnectedNRopes {
    public static int sumOfNodes(int ropes[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;
        for (int i = 0; i < n; i++) {
            pq.add(ropes[i]);
        }
        while (pq.size() > 1) {
            int currCost = pq.remove() + pq.remove();
            cost = cost + currCost;
            pq.add(currCost);
        }
        return cost;
    }

    public static void main(String[] args) {
        int ropes[] = { 4, 3, 2, 6 };
        int n = ropes.length;
        System.out.println("Minimum cost "+sumOfNodes(ropes, n));
    }
}
