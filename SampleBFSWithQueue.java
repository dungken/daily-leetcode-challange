import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SampleBFSWithQueue {



    public static void main(String[] args) {
        int [][] graph = {
                {0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0}
        };

        // Khai bao
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> mark = new HashSet<>();

        // Khoi tao
        queue.add(0);
        mark.add(0);

        // Duyet queue
        while (!queue.isEmpty()) {
            int u = queue.poll();
            // process u
            System.out.print(u + " ");

            // Duyet tat ca cac dinh ke voi u la v ma chua duoc duyet
            for (int v = 0; v < graph.length; v++) {
                if(graph[u][v] == 1 && !mark.contains(v)) {
                    // Them dinh v vao queue
                    queue.add(v);
                    // Danh dau v da duoc duyet
                    mark.add(v);
                }
            }
        }
    }
}
