import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnAlgorithm {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calculateInc(ArrayList<Edge> graph[], int inc[]) {
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                inc[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int inc[] = new int[graph.length];
        calculateInc(graph, inc);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inc.length; i++) {
            if (inc[i] == 0) {
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr +" ");
            for(int i =0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                inc[e.dest]--;
                if(inc[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
}
