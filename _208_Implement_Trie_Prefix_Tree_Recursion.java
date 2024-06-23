public class _208_Implement_Trie_Prefix_Tree_Recursion {
    class Trie {
        private final int SIZE = 26;
        class TrieNode {
            String word;
            TrieNode children[] = new TrieNode[SIZE];
            boolean isWord;
        }

        private TrieNode root = new TrieNode();
        public Trie() {
        }

        public void insert(TrieNode parent, int currIndex, String word) {
            if(currIndex < word.length()) {
                int childIndex = word.charAt(currIndex) - 'a';
                if(parent.children[childIndex] == null) {
                    parent.children[childIndex] = new TrieNode();
                }

                if(currIndex == word.length() - 1) {
                    parent.children[childIndex].isWord = true;
                } else {
                    insert(parent.children[childIndex], currIndex + 1, word);
                }
            }
        }
        public void insert(String word) {
            insert(root, 0, word);
        }
        public boolean search(TrieNode parent, int currIndex, String word) {
            if(currIndex < word.length()) {
                int childIndex = word.charAt(currIndex) - 'a';
                if(parent.children[childIndex] == null)
                    return false;
                if(currIndex == word.length() - 1)
                    return parent.children[childIndex].isWord;

                return search(parent.children[childIndex], currIndex + 1, word);
            }
            return false;
        }
        public boolean search(String word) {
            return search(root, 0, word);
        }

        private boolean startsWith(TrieNode parent, int currIndex, String prefix) {
            if(currIndex < prefix.length()) {
                int childIndex = prefix.charAt(currIndex) - 'a';
                if(parent.children[childIndex] == null)
                    return false;
                if(currIndex == prefix.length() - 1)
                    return true;

                return startsWith(parent.children[childIndex], currIndex + 1, prefix);
            }
            return false;
        }
        public boolean startsWith(String prefix) {
            return startsWith(root, 0, prefix);
        }
    }


    public static void main(String[] args) {

    }
}
