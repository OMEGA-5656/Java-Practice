import java.util.ArrayList;
import java.util.List;

public class DFS {

    private final List<List<Integer>> graph;
    private final boolean[] visited;

    public DFS(int size) {
        graph = new ArrayList<>();
        visited = new boolean[size];
        for (int i = 0; i < size; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int from, int to) {
        graph.get(from).add(to);
    }

    public void explore(int node) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;
        System.out.print(node + " ");
        for (int next : graph.get(node)) {
            explore(next);
        }
    }

    public static void main(String[] args) {
        DFS search = new DFS(6);
        search.addEdge(0, 1);
        search.addEdge(0, 2);
        search.addEdge(1, 3);
        search.addEdge(1, 4);
        search.addEdge(2, 5);
        search.explore(0);
    }
}

