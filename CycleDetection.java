import java.util.ArrayList;
import java.util.List;

public class CycleDetection {

    private final List<List<Integer>> graph;
    private final int nodeCount;

    public CycleDetection(int nodeCount) {
        this.nodeCount = nodeCount;
        graph = new ArrayList<>();
        for (int i = 0; i < nodeCount; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int from, int to) {
        graph.get(from).add(to);
    }

    private boolean hasCycleFrom(int node, boolean[] visited, boolean[] stack) {
        if (stack[node]) {
            return true;
        }
        if (visited[node]) {
            return false;
        }
        visited[node] = true;
        stack[node] = true;
        for (int neighbour : graph.get(node)) {
            if (hasCycleFrom(neighbour, visited, stack)) {
                return true;
            }
        }
        stack[node] = false;
        return false;
    }

    public boolean hasCycle() {
        boolean[] visited = new boolean[nodeCount];
        boolean[] stack = new boolean[nodeCount];
        for (int i = 0; i < nodeCount; i++) {
            if (hasCycleFrom(i, visited, stack)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetection graph = new CycleDetection(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        System.out.println(graph.hasCycle() ? "Graph has a cycle" : "Graph does not have a cycle");
    }
}

