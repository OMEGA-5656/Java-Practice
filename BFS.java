import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BFS {

    private final List<List<Integer>> graph;
    private final boolean[] visited;

    public BFS(int size) {
        graph = new ArrayList<>();
        visited = new boolean[size];
        for (int i = 0; i < size; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int from, int to) {
        graph.get(from).add(to);
        graph.get(to).add(from);
    }

    public void traverse(int start) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.removeFirst();
            System.out.print(node + " ");
            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.addLast(next);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS search = new BFS(6);
        search.addEdge(0, 1);
        search.addEdge(0, 2);
        search.addEdge(1, 3);
        search.addEdge(1, 4);
        search.addEdge(2, 5);
        search.traverse(0);
    }
}
