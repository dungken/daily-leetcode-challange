import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDSAWithStack {
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
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>(); // Danh dau cac dinh da duoc duyet

        // Khoi tao
        stack.add(0);
        set.add(0);

        // Duyet
        while(!stack.isEmpty()) {
            int u = stack.pop();
            // Thuc hien
            System.out.print(u + " ");
            // Duyet qua cac dinh ke voi u la v ma chua duoc duyet va them vao stack
            for (int v = 0; v < graph.length; v++) {
                if(graph[u][v] == 1 && !set.contains(v)) {
                    stack.add(v);
                    // Danh dau dinh v da duoc duyet
                    set.add(v);
                }
            }
        }
    }
}
