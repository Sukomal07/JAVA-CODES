import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlights {
    static class Edge {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int flights[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];
            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class info {
        int vertex, cost, stops;

        public info(int v, int c, int s) {
            vertex = v;
            cost = c;
            stops = s;
        }
    }

    public static int cheapestFlights(int flights[][], int n, int src, int dest, int wt, int k) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, flights);
        int dist[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<info> q = new LinkedList<>();
        q.add(new info(src, 0, 0));
        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr.stops > k) {
                break;
            }
            for (int i = 0; i < graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);
                int u = e.src;
                int v = e.dest;
                int w = e.wt;
                if (dist[u] != Integer.MAX_VALUE && curr.cost + w < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + w;
                    q.add(new info(v, dist[v], curr.stops + 1));
                }
            }
        }
        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int flights[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 0, 2, 500 } };
        int src = 0, dest = 2, k = 1;
        System.out.println(cheapestFlights(flights, n, src, dest, dest, k));

    }

}