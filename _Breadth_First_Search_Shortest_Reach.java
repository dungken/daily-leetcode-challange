import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _Breadth_First_Search_Shortest_Reach {
    private static int[][] distances;
    private static int[] bfsDistances;
    private static boolean[] isChecked;
    private static List<Integer> result;


    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        // Write your code here
        distances = new int[n + 1][n + 1];
        bfsDistances = new int[n + 1];
        isChecked = new boolean[n + 1];
        result = new LinkedList<>();

        for(List<Integer> e : edges) {
            int u = e.get(0);
            int v = e.get(1);
            distances[u][v] = 6;
            distances[v][u] = 6;
        }

        Queue<Integer> myQueue = new LinkedList<>();
        
        myQueue.add(s);
        isChecked[s] = true;
        
        while(!myQueue.isEmpty()) {
            int curr = myQueue.poll();
            for (int i = 1; i <= n; i++) {
                if(distances[curr][i] != 0 && !isChecked[i]) {
                    isChecked[i] = true;
                    bfsDistances[i] = bfsDistances[curr] + distances[curr][i];
                    myQueue.add(i);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if(i != s) {
                if(bfsDistances[i] != 0) {
                    result.add(bfsDistances[i]);
                } else {
                    result.add(-1);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
