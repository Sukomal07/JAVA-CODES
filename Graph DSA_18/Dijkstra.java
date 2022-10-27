import java.util.*;

public class Dijkstra {
    static class Edge {
        int src, dest , wt;

        Edge(int s, int d , int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,4));
        graph[1].add(new Edge(1, 2,1));
        graph[1].add(new Edge(1, 3 ,7));
        graph[2].add(new Edge(2, 4,3));
        graph[3].add(new Edge(3, 4,2));
        graph[3].add(new Edge(3, 5,1));
        graph[4].add(new Edge(4, 5,5));
    }

    static class pair implements Comparable<pair> {
        int n;
        int path;

        pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(pair p2) {
            return this.path - p2.path;
        }
    }

    public static void printDijkstra(ArrayList<Edge> graph[], int src) { //O(V+Elogv)
        int dist[] = new int[graph.length];
        for(int i =0; i<graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(src, 0));
        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;
                for(int i =0; i<graph[curr.n].size(); i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.add(new pair(v, dist[v]));
                    }
                }
            }
        }
        for(int i =0; i<dist.length; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        int src = 0;
        printDijkstra(graph, src);
    }
}
