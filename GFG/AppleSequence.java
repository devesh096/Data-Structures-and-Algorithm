package GFG;

class AppleSequence {
    public static int appleSequence(int n, int m, String arr) {
        // code here
        int start = 0, end = 0;
        int curr = 0;
        int maxx = 0;
        char c[] = arr.toCharArray();
        while (end < n) {
            if (c[end] == 'A') {
                maxx = Math.max(maxx, end - start + 1);
            }
            if (c[end] == 'O') {
                curr++;
                if (curr > m) {
                    while (start < end && c[start] != 'O')
                        start++;
                    start++;
                }
                maxx = Math.max(maxx, end - start + 1);
            }
            end++;
        }
        return maxx;
    }
}
