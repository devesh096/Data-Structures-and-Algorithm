public class findPermutations {
    public static void main(String[] args) {
        String name = "dev";

        findPermutation(name, "");
    }

    public static void findPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(Newstr, ans + curr);

        }
    }
}
