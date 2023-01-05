public class removeDuplicates {

    public static void main(String[] args) {

        String s1 = "devesh";
        removeDuplicates(s1, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(s1); // apncoleg
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }

}
