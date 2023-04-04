import java.util.*;

public class optimalPartitionOfString {

    public int partitionString(String s) {
        int count = (s.isEmpty()) ? 0 : 1;
        HashSet<Character> letters = new HashSet<Character>(); // creating a set to find unique letters in substring
        for (int i = 0; i < s.length(); i++) {
            if (letters.contains(s.charAt(i))) { // if we encounter a duplicate
                letters.clear(); // remove all letters in set
                count++; // increment count
            }
            letters.add(s.charAt(i));
        }
        return count;
    }

}
