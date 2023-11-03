package GFG;

import java.util.ArrayList;
import java.util.TreeSet;

public class pythagorasTriplet {
    class Solution {
        boolean checkTriplet(int[] arr, int n) {
            TreeSet<Integer> a = new TreeSet<Integer>();
            for (int i = 0; i < arr.length; i++) {
                a.add(arr[i]);
            }
            ArrayList<Integer> res = new ArrayList<Integer>();
            for (int x : a) {
                res.add(x);
            }
            TreeSet<Integer> hash = new TreeSet<Integer>();
            for (int i = 0; i < res.size(); i++) {
                if (hash.contains(res.get(i) * res.get(i)) == true) {
                    return true;
                }
                for (int j = i - 1; j >= 0; j--) {
                    int value = res.get(j) * res.get(j) + res.get(i) * res.get(i);
                    hash.add(value);
                }
            }
            return false;
        }
    }
}
