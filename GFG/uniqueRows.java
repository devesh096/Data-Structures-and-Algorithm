package GFG;

import java.util.ArrayList;
import java.util.HashSet;

public class uniqueRows {
    class GfG {
        public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
            // add code here.
            HashSet<String> st = new HashSet<>();
            ArrayList<ArrayList<Integer>> vec = new ArrayList<>();

            for (int i = 0; i < r; i++) {
                StringBuilder curr = new StringBuilder();
                for (int j = 0; j < c; j++) {
                    curr.append('0' + a[i][j]);
                }
                st.add(curr.toString());
            }
            for (int i = 0; i < r; i++) {
                StringBuilder curr = new StringBuilder();
                for (int j = 0; j < c; j++) {
                    curr.append('0' + a[i][j]);
                }
                if (st.contains(curr.toString())) {
                    st.remove(curr.toString());
                    ArrayList<Integer> demo = new ArrayList<>();
                    for (int j = 0; j < c; j++) {
                        demo.add(a[i][j]);
                    }
                    vec.add(demo);
                }
            }
            return vec;
        }
    }
}
