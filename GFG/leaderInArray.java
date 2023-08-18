package GFG;

import java.util.ArrayList;
import java.util.Collections;

public class leaderInArray {

    class Solution {
        // Function to find the leaders in the array.
        static ArrayList<Integer> leaders(int arr[], int n) {

            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.add(arr[n - 1]);
            int currentMax = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] >= currentMax) {
                    ans.add(arr[i]);
                    currentMax = arr[i];
                }
            }

            Collections.reverse(ans);

            return ans;
            // Your code here
        }
    }

}
