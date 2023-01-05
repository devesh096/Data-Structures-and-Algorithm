
/*
 * Given an integer arrray of size n, find all the elements that appear 
 * more than n/3 times
 * 
 * Example1.
 * nums[] = {1,3,2,5,1,3,1,5,1}
 * Ans. 1
 * 
 * We will use HashMap to Solve this Problem
 */

import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {
        int nums[] = { 1, 2 };
        ArrayList<Integer> ans = majorityElement(nums);

        System.out.println(ans);
    }

    public static ArrayList<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            // if (hm.containsKey(nums[i])) {
            // int k = hm.get(nums[i]);
            // hm.put(nums[i], k + 1);
            // } else {
            // hm.put(nums[i], 1);
            // }

            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // Set<Integer> keySets = hm.keySet();

        for (Integer k : hm.keySet()) {
            if (hm.get(k) > nums.length / 3) {
                ans.add(k);
            }

        }
        return ans;
    }

}
