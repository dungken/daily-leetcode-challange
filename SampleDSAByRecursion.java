import java.util.HashSet;
import java.util.Set;

public class SampleDSAByRecursion {


    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0}
        };

        // Khai bao
        Set<Integer> mark = new HashSet<>(); // set danh dau cac phan tu da duoc duyet
        mark.add(0);
        DFS(0, graph, mark);
    }

    private static void DFS(int u, int[][] graph, Set<Integer> mark) {
        // process u
        System.out.print(u + " ");
        // Duyet cac dinh ke voi u ma chua duoc duyet
//        for (int v = 0; v < graph.length; v++) {
//            if (graph[u][v] == 1 && !mark.contains(v)) {
//                mark.add(v);
//                DFS(v, graph, mark);
//            }
//        }

        // # Thu tu duyet giong voiw cach lam voi stack
        for (int v = graph.length - 1; v >= 0; v--) {
            if (graph[u][v] == 1 && !mark.contains(v)) {
                mark.add(v);
                DFS(v, graph, mark);
            }
        }
    }
}
