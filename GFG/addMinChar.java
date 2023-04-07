package GFG;

public class addMinChar {

    public static int addMinChars(String str) {
        // code here
        StringBuilder temp = new StringBuilder(str);
        String rev = temp.reverse().toString();
        String s = temp.reverse().append('$').append(rev).toString();
        int n = s.length();
        int[] lps = new int[n];
        int i = 1, len = 0;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return str.length() - lps[n - 1];
    }
}
