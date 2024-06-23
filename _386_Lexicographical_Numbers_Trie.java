import java.util.ArrayList;
import java.util.List;

public class _386_Lexicographical_Numbers_Trie {
    public class TrieNode {
        public static final int SIZE = 10;
        public TrieNode children[] = new TrieNode[SIZE];
    }

    public TrieNode root = new TrieNode();
    public List<Integer> result = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for (int i = 1; i <= n; i++) {
            String iString = String.valueOf(i);
            insert(root, 0, iString);
        }

        dfs(root, 0);
        return result;
    }

    private void dfs(TrieNode parent, int prefixNumber) {
        if(parent != null) {
            for (int i = 0; i < TrieNode.SIZE; i++) {
                if(parent.children[i] != null) {
                    int newNumber = prefixNumber * 10 + i;
                    result.add(newNumber);
                    dfs(parent.children[i], newNumber);
                }
            }
        }
    }

    public void insert(TrieNode parent, int currIndex, String number) {
        if(currIndex < number.length()) {
            int childIndex = number.charAt(currIndex) - '0';
            if(parent.children[childIndex] == null)
                parent.children[childIndex] = new TrieNode();
            insert(parent.children[childIndex], currIndex + 1, number);
        }
    }

    public static void main(String[] args) {

    }
}
