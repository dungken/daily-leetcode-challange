public class _208_Implement_Trie_Prefix_Tree_Loop {
    class Trie {
        private final int SIZE = 26;

        private class TrieNode {
            String word;
            TrieNode children[] = new TrieNode[SIZE];
            boolean isWord = false;
        }

        TrieNode root = new TrieNode();

        public Trie() {
        }


        public void insert(String word) {
            TrieNode parent = root;
            int currIndex = 0;
            while (currIndex < word.length()) {
                int childIndex = word.charAt(currIndex) - 'a';
                if (parent.children[childIndex] == null)
                    parent.children[childIndex] = new TrieNode();
                if (currIndex == word.length() - 1)
                    parent.children[childIndex].isWord = true;

                parent = parent.children[childIndex];
                ++currIndex;
            }
        }

        public boolean search(String word) {
            TrieNode parent = root;
            int currIndex = 0;
            while (currIndex < word.length()) {
                int childIndex = word.charAt(currIndex) - 'a';
                if (parent.children[childIndex] == null)
                    return false;
                parent = parent.children[childIndex];
                ++currIndex;
            }
            return parent.isWord;
        }


        public boolean startsWith(String prefix) {
            TrieNode parent = root;
            int currIndex = 0;
            while (currIndex < prefix.length()) {
                int childIndex = prefix.charAt(currIndex) - 'a';
                if (parent.children[childIndex] == null)
                    return false;
                parent = parent.children[childIndex];
                ++currIndex;
            }
            return true;
        }
    }


    public static void main(String[] args) {

    }
}
