public class similarStringGroups {

    public static int[] par;
    public static int[] size;

    public static int findPar(int v) {
        if (v == par[v])
            return v;
        return par[v] = findPar(par[v]);
    }

    public static void mergeOrUnionBySize(int gpu, int gpv) {
        if (size[gpu] > size[gpv]) {
            par[gpv] = gpu;
            size[gpu] += size[gpv];
        } else {
            par[gpu] = gpv;
            size[gpv] += size[gpu];
        }
    }

    public int numSimilarGroups(String[] strs) {
        int n = strs.length;

        par = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            par[i] = i;
            size[i] = 1;
        }

        int numberOfGroups = n; // Initially number of groups are n

        // Checks every string with every other string
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isSimilar(strs[i], strs[j])) { // Checks if the strings are similar or not
                    int GlobalParOfu = findPar(i);
                    int GlobalParOfv = findPar(j);

                    if (GlobalParOfu != GlobalParOfv) {
                        mergeOrUnionBySize(GlobalParOfu, GlobalParOfv); // 2 separate groups have been merged
                        numberOfGroups--; // So decrement group or island count by 1
                    }
                }
            }
        }
        return numberOfGroups; // Return group count
    }

    /*
     * Condition of String Similarity :-
     * 1) If the string is exactly same
     * 2) If by only one swap in s1, we can make s1 equal to s2
     */
    public static boolean isSimilar(String s1, String s2) {
        int n = s1.length(), count = 0;

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                count++;

            // Since the string is anagram, given in constraint
            if (count > 2)
                return false;
        }
        return true;
    }
}
