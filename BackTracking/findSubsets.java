public class findSubsets {

    public static void main(String[] args) {
        String s1 = "abc";
        // System.out.println(s1.length());

        findSubset(s1, "", 0);
    }

    private static void findSubset(String s1, String ans, int i) {
        // base case
        if (i == s1.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        // recursion
        // yes choice - when a character is added to subset
        findSubset(s1, ans + s1.charAt(i), i + 1);
        // no choice - when a character is not added to subset
        findSubset(s1, ans, i + 1);

    }

}
