public class findSubsets {

    public static void main(String[] args) {
        String s1 = "abc";

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
        // yes choice
        findSubset(s1, ans + s1.charAt(i), i + 1);
        // no choice
        findSubset(s1, ans, i + 1);

    }

}
