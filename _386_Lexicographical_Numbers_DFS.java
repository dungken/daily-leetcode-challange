import java.util.LinkedList;
import java.util.List;

public class _386_Lexicographical_Numbers_DFS {
    private List<Integer> result = new LinkedList<>();
    private int MAX = 0;
    public List<Integer> lexicalOrder(int n) {
        MAX = n;
        dfs(0);
        return result;
    }

    private void dfs(int base) {
        if(base <= MAX) {
            for (int i = 0; i <= 9; i++) {
                int newNumber = base * 10 + i;
                if(newNumber != 0 && newNumber <= MAX) {
                    result.add(newNumber);
                    dfs(newNumber);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
