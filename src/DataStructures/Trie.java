package DataStructures;

public class Trie {
    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
    }

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into the trie.
    public void insert(String word)
    {
        TrieNode node = root;
        for (char c : word.toCharArray())
        {
            int index = c - 'a'; // Map char to index 0-25
            if (node.children[index] == null)
            {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

//    public boolean search(String word)
//    {
//        TrieNode node = root;
//        for (char c : word.toCharArray())
//        {
//            int index = c - 'a';
//        }
//    }
}


