//Given a string of length n of lowercase alphabet characters, we need to count total number of 
//distinct substringsof this string
/*
 * Input = "ababa"
 * 
 * Output : 10
 * Exaplaination {a,ab,aba,abab,ababa,b,ba,bab,baba,""}
 * 
 * example : 
 * abcdef
 * 
 * Prefix - {abcdef,abcde,abcd,abc,ab,a}
 * Suffix - {abcdef,bcdef,cdef,def,ef,f}
 * Unique Substring - All prefix of all sufix = all sufix of all prefix
 */

public class uniqueSubString {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();

            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    // public static Node root = new Node();
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        String str = "ababa";

        // suffix

        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);

        }

        System.out.println(countNodes(root));
    }

}